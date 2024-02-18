import javax.swing.*;
class Login extends JFrame
{
	JLabel l1,l2;
	JButton b1,b2;
	JTextField tf1;
	JPasswordField tf2;
	JTextArea ta;
	public Login()
	{
		setLayout(null);
		l1=new JLabel("User Name:");
		l2=new JLabel("Password:");
		b1=new JButton("Login");
		b2=new JButton("Reset");
		tf1=new JTextField("Hello",25);
		tf2=new JPasswordField(25);

		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(b1);
		add(b2);
		add(ta);
		l1.setBounds(150,150,80,20);
		l2.setBounds(150,190,80,20);
		tf1.setBounds(230,150,80,20);
		tf2.setBounds(230,190,80,20);
		b1.setBounds(180,230,80,30);
		b2.setBounds(280,230,80,30);
		ta.setBounds(200,280,100,100);
		
	}
	public static void main(String args[])
	{
		Login d=new Login();
		d.setTitle("Login");
		d.setSize(500,500);
		d.setVisible(true);
	}
}

