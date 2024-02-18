import java.awt.*;
import java.awt.event.*;
class Login extends Frame implements ActionListener
{
	Label l1,l2;
	Button b1,b2,b3;
	TextField tf1,tf2;
 String result="";

	public Login()
	{
		setLayout(null);
		l1=new Label("User Name:");
		l2=new Label("Password:");
		b1=new Button("Login");
		b2=new Button("Reset");
              b3=new Button("Cancel");
		tf1=new TextField(25);
		tf2=new TextField(25);
		tf2.setEchoChar('*');
        
		
		add(l1);
		add(tf1);

		add(l2);
		add(tf2);

		add(b1);
		add(b2);
	       add(b3);

		l1.setBounds(150,150,80,20);
		l2.setBounds(150,190,80,20);

		tf1.setBounds(230,150,80,20);
		tf2.setBounds(230,190,80,20);

		b1.setBounds(180,230,50,30);
		b2.setBounds(250,230,50,30);
              b3.setBounds(320,230,50,30);
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
          	  Login d=new Login();
		  d.setTitle("Login Form");
		  d.setSize(500,500);
		  d.setVisible(true);
	}
public void paint(Graphics g)
	{
		g.drawString(result,200,300);
	}
}
