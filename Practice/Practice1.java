import java.awt.*;
import java.awt.event.*;
class Practice1 extends Frame implements MouseListener
{
label l;
public Practice1()
{
   addMouseListener(this);
  l=new label();
l.setBounds(20,50,100,50);
add(l);
}
public void MouseClicked(MouseEvent e)
{
l.setText("Mouse Clicked");
setBackground(Color.GREEN);
}
public void MouseEntered(MouseEvent e)
{
l.setText("Mouse Entered");
setBackground(Color.ORANGE);
}
public void MousePressed(MouseEvent e)
{
l.setText("Mouse Pressed ");
setBackground(Color.Blue);
}
public void MouseExited(MouseEvent e)
{
l.setText("Mouse Exited ");
setBackground(Color.WHITE);
}
public void MouseRelease(MouseEvent e)
{
l.setText("Mouse Release ");
setBackground(Color.GREY);
}
public static void main(String args[])
{
Practice1 p=new Practice1();
p.setSize(300,300);
p.setLayout(null);
p.setVisible(true);
}
} 