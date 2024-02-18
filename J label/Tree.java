import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
class Tree extends JFrame
{
  public Tree()
  {
	DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");
	DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");
	DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");
       DefaultMutableTreeNode font=new DefaultMutableTreeNode("size");
	style.add(color);
	style.add(font);
       style.add(size);
	DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");
	DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");
	DefaultMutableTreeNode black=new DefaultMutableTreeNode("black");
	DefaultMutableTreeNode green=new DefaultMutableTreeNode("green");
DefaultMutableTreeNode Size1=new DefaultMutableTreeNode("14");
DefaultMutableTreeNode Size2=new DefaultMutableTreeNode("15");
DefaultMutableTreeNode Size3=new DefaultMutableTreeNode("16");
DefaultMutableTreeNode Font1=new DefaultMutableTreeNode("Time of Roman");
DefaultMutableTreeNode Font2=new DefaultMutableTreeNode("Verdan");

	color.add(red);
	color.add(blue);
	color.add(black);
	color.add(green);
size.add(Size1);
size.add(Size2);
size.add(Size3);
font.add(Font1);
font.add(Font2);
	JTree jt=new JTree(style);
	add(jt);
   }
   public static void main(String[] args)
   {
	Tree f=new Tree();
	f.setSize(200,200);
	f.setVisible(true);
   }
}
