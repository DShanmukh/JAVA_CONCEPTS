import java.awt.*;  
import java.awt.event.*;  
class KeyListenerExample extends Frame implements KeyListener
{  
    Label l;  
    TextArea area;  
    public KeyListenerExample()
    {         
        l=new Label();  
        l.setBounds(20,50,100,20);  
        area=new TextArea();  
        area.setBounds(20,80,300, 300);  
        area.addKeyListener(this);  
          
        add(l);
	add(area);        
    }  
    public void keyPressed(KeyEvent e) 
    {
	setBackground(Color.RED);
	l.setText("Key Pressed");  
    }  
    public void keyReleased(KeyEvent e) 
    {  
        l.setText("Key Released");
	setBackground(Color.BLUE);
    }  
    public void keyTyped(KeyEvent e) 
     {  
        l.setText("Key Typed");  
	setBackground(Color.GREEN);
     }  
  
    public static void main(String[] args) 
    {  
        KeyListenerExample k1=new KeyListenerExample();
	k1.setSize(400,400);  
        k1.setLayout(null);  
        k1.setVisible(true);  
    }  
} 