import java.awt.*;

class BorderLayout extends Frame
{ 
	Button b1,b2,b3,b4,b5,b6;
	public BorderLayout()
	{ 
		//this keyword is optional because all methods are current class methods only
		this.setSize(400,400);
		this.setVisible(true);
		this.setTitle("BorderLayout");
		this.setLayout(new BorderLayout());
		b1=new Button("Boys");
		b2=new Button("Girls");
		b3=new Button("management");
		b4=new Button("Teaching Staff");
		b5=new Button("non-teaching staff");
		b6=new Button("Hello");
		this.add("North",b1);
		this.add("Center",b2);
		this.add("South",b3);
		this.add("East",b4);
		this.add("West",b5);
		add("Center",b6);
	}
}
class Demo
{ 
	public static void main(String[] args)
	{ 
		BorderLayout f=new BorderLayout();
	}
}
