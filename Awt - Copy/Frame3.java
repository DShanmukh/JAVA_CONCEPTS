import java.awt.*;
import java.awt.event.*;
class Frame3 extends Frame implements ActionListener
{
   //Declare all the components which are needed for you.
   Label l1,l2;
   Button b1,b2,b3;
   TextField tf1,tf2;
   String result="";

    public Frame3()
	{
		setLayout(new FlowLayout());
		//Initialize the components
		l1=new Label("USERNAME");
		l2=new Label("PASSWORD");
		tf1=new TextField(20);
		tf2=new TextField(20);
		tf2.setEchoChar('*');
		b1=new Button("LogIn");
		b2=new Button("Reset");
		b3=new Button("Cancel");
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(b1);
		add(b2);
		add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
             		 String user=tf1.getText();
			 String pwd=tf2.getText();
			 if(user.equals("21A91A04K0") && pwd.equals("Dhoni@07"))
			 {
				 result="Login Success";
				 repaint();
			 }
		     else
			{ 
				 result="Login Failure";
				 repaint();
			}
		}
		else if(ae.getSource()==b2)
		{
             tf1.setText(" ");
			 tf2.setText("");
		}
		else
		{
			System.exit(0);
		}
	}

	public static void main(String args[])
	{
		Frame3 f1=new Frame3();
		f1.setTitle("LoginForm");
		f1.setSize(300,400);
		f1.setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.drawString(result,100,300);
	}
}
