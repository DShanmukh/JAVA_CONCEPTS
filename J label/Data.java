import javax.swing.*;
class Data extends JFrame
{
	Data()
	{
		String data[][]={ {"101","Shanmukh","700000","Google"},
               {"102","Aditya","700000","Microsoft"},
		{"103","Murthy","700000","Flipkart"},
		{"104","Sai","700000","Amazon"}};
		String column[]={"ID","NAME","SALARY","COMPANY"};
		JTable jt=new JTable(data,column);
		jt.setBounds(30,40,200,300);
		JScrollPane sp=new JScrollPane(jt);
		add(sp);
	}
	public static void main(String[] args)
	{
		Data f=new Data();
		f.setSize(300,400);
		f.setVisible(true);
	}
}