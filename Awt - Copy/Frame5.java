import java.awt.*;
import java.awt.event.*;
class Frame5 extends Frame  implements ActionListener
{
    Button b1,b2,b3;
public Frame5()
{
     setLayout(new FlowLayout());
     b1=new Button("RED");
     b2=new Button("ORANGE");
     b3=new Button("GREEN");
 add(b1);
 add(b2);
 add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
public static void main(String args[])
{
  Frame5 f=new Frame5();
   f.setSize(500,500);
   f.setTitle("Login");
   f.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
   if(ae.getSource()==b1)
setBackground(Color.RED);
if(ae.getSource()==b2)
setBackground(Color.ORANGE);
if(ae.getSource()==b3)
setBackground(Color.GREEN);
}
}