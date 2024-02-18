import java.awt.*;  
import java.awt.event.*;  
class MouseListenerExample extends Frame implements MouseListener
{  
    Label l;  
    public MouseListenerExample()
     {  
        addMouseListener(this);  
        l=new Label();  
        l.setBounds(20,50,100,20);  
        add(l);    
    }  
    public void mouseClicked(MouseEvent e) 
    {  
        l.setText("Mouse Clicked"); 
	setBackground(Color.ORANGE);
    }  
    public void mouseEntered(MouseEvent e) 
    {  
        l.setText("Mouse Entered");  
	setBackground(Color.YELLOW);
    }  
    public void mouseExited(MouseEvent e) 
    {  
        l.setText("Mouse Exited");
	setBackground(Color.WHITE);
    }  
    public void mousePressed(MouseEvent e) 
    {  
        l.setText("Mouse Pressed"); 
	setBackground(Color.BLUE);
    }  
    public void mouseReleased(MouseEvent e) 
    {  
        l.setText("Mouse Released"); 
	setBackground(Color.red);
    }  
  public static void main(String[] args) 
  { 
    MouseListenerExample m1=new MouseListenerExample();  
    m1.setSize(300,300);  
    m1.setLayout(null);  
    m1.setVisible(true);
  }  
}