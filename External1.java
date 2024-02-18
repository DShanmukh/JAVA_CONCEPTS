import java.awt.*;
import java.awt.event.*;
class External1 extends Frame implements KeyListener
{
 Label l;
TextArea area;
public External1()
{
  l=new Label();
l.setBounds(20,50,100,20);
area=new TextArea();
area.setBounds(20,80,300,300);
area.addKeyListener(this);
add(l);
add(area);
}
public void keyPressed(KeyEvent ke)
{
l.setText("key pressed");
}
public void keyTyped(KeyEvent ke)
{
l.setText("key Typed");
}
public void keyReleased(KeyEvent ke)
{
l.setText("key Realesed");
}
public static void main(String args[])
{
External1 e= new External1();
e.setSize(400,400);
e.setLayout(null);
e.setVisible(true);
}
}

