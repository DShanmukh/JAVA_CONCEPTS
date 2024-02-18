import java.awt.*;
class CheckBox extends Frame
{   
	Checkbox cb1,cb2,cb3,cb4,r1,r2,f1,f2,f3;
	CheckboxGroup cg,cg1;
    Label l1,l2,l3;
	public CheckBox()
	{
		setLayout(new FlowLayout());
		l1 = new Label("Qualifications:");
		l2 = new Label("Gender:");
		l3 = new Label("Fruits");
		cb1=new Checkbox("SSC",true);
		cb2=new Checkbox("DEGREE");
	    	cb3=new Checkbox("MCA");
		cb4=new Checkbox("BTECH");
		add(l1); 
		add(cb1); 
		add(cb2); 
		add(cb3); 
		add(cb4);
		/*System.out.println(cb1.getLabel());
		System.out.println(cb2.getState());*/
        	//Radio Button creation
		cg=new CheckboxGroup();
		r1=new Checkbox("Male",cg,true);
		r2=new Checkbox("Female",cg,false);
		add(l2); 
		add(r1); 
		add(r2);
		//System.out.println(cb1.getLabel());
		//System.out.println(cb1.getState());
		cg1=new CheckboxGroup();
		f1=new Checkbox("Mango",cg1,true);
		f2=new Checkbox("Apple",cg1,false);
		f3=new Checkbox("Banana",cg1,false);
		add(l3);
		add(f1);
		add(f2);
		add(f3);
	}
	public static void main(String[] args)
	{ 
		CheckBox f=new CheckBox();
		f.setVisible(true); 
		f.setTitle("ratan");
		f.setBackground(Color.RED); 
		f.setSize(400,500);
	}
}