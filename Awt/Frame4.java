import java.awt.*;
class Frame4 extends Frame 
{
  Label l1,l2;
  Choice ch;
   List li;
public Frame4()
{
setLayout(new FlowLayout());
l1=new Label("WEEK DAY");
ch=new Choice();
ch.add("Mon");
ch.add("Tue");
ch.add("Wed");
ch.add("Thu");
ch.add("Fri");
ch.add("Sat");
add(l1);
add(ch);
l2=new Label("Fruit");
li=new List(6,true);
li.add("Apple");
li.add("Orange");
li.add("Banana");
li.add("Jackfruit");
li.add("Sapota");
li.add("Pineapple");
add(l2);
add(li);
}
public static void main (String args[])
{
Frame4 f= new Frame4();
f.setSize(500,500);
f.setTitle(" Schedule");
f.setVisible(true);
f.setBackground(Color.YELLOW);
}
}

