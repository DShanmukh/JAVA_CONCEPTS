import java.awt.*;
import java.awt.event.*;
 class MenuDemo extends Frame implements ActionListener 
{	
	TextArea ta;
	Button b;
	public MenuDemo()
	{	
		setLayout(null);
		b=new Button("Bigboss");
		ta=new TextArea();
		ta.setBounds(5,80,495,450);
		
		MenuBar mb=new MenuBar();
		setMenuBar(mb);
		MenuShortcut n=new MenuShortcut(KeyEvent.VK_N);
		MenuShortcut o=new MenuShortcut(KeyEvent.VK_O);
		MenuShortcut x=new MenuShortcut(KeyEvent.VK_X);
			Menu filemenu=new Menu("FILE");
			Menu editmenu=new Menu("EDIT");
				MenuItem newAction=new MenuItem("NEW",n);
				MenuItem openAction=new MenuItem("OPEN",o);
				MenuItem exitAction=new MenuItem("EXIT",x);
				MenuItem cutAction=new MenuItem("CUT");
				MenuItem copyAction=new MenuItem("COPY");
				MenuItem pasteAction=new MenuItem("PASTE");
	newAction.addActionListener(this);
	openAction.addActionListener(this);
	exitAction.addActionListener(this);
	filemenu.addSeparator();
	filemenu.add(newAction);
	filemenu.addSeparator();
	filemenu.add(openAction);
	filemenu.addSeparator();
	filemenu.add(exitAction);
	mb.add(filemenu);
	cutAction.addActionListener(this);
	copyAction.addActionListener(this);
	pasteAction.addActionListener(this);
	editmenu.add(cutAction);
	editmenu.addSeparator();
	editmenu.add(copyAction);
	editmenu.addSeparator();
	editmenu.add(pasteAction);
	editmenu.addSeparator();
	mb.add(editmenu);
	addWindowListener(new WindowAdapter() 
	{
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
	});
                            }
	public void actionPerformed(ActionEvent ae)
	{
		String action=ae.getActionCommand();
			if(action.equals("NEW"))
			{
				System.out.println("New File Created");
				this.add(ta);
			}
			else if(action.equals("OPEN"))
			{
				System.out.println("Open the File");
			}
			else if(action.equals("EXIT"))
			{
				System.exit(0);
			}
			else if(action.equals("CUT"))
			{
				System.out.println("Cut the Selected Text");
			}
			else if(action.equals("COPY"))
			{
				System.out.println("Copy the Selected Text");
			}
			else if(action.equals("PASTE"))
			{
				System.out.println("Paste the Selected Text");
			}
	}
	public static void main(String[] args)
	{
 		MenuDemo md=new MenuDemo();
		md.setSize(500,500);
		md.setTitle("Menu Demo1");
		md.setVisible(true);
	}
}

