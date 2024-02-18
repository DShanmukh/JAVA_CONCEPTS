import java.awt.*;
import java.awt.event.*;
class Traffic extends Frame implements ItemListener
{

	CheckboxGroup grp;	
	Checkbox redLight, yellowLight, greenLight;	
	Label msg;
	public Traffic()
	{
		grp=new CheckboxGroup();
		redLight = new Checkbox("Red", grp, false);
		yellowLight = new Checkbox("Yellow", grp, false);
		greenLight = new Checkbox("Green", grp, false);
		msg = new Label("");
		
		setLayout(new FlowLayout());
		redLight.addItemListener(this);
		yellowLight.addItemListener(this);
		greenLight.addItemListener(this);
		
		add(redLight);
		add(yellowLight);
		add(greenLight);
		add(msg);
		msg.setFont(new Font("Leelawadee", Font.BOLD, 30));
	}
	public void itemStateChanged(ItemEvent ie) 
	{
		redLight.setForeground(Color.BLACK);
		yellowLight.setForeground(Color.BLACK);
		greenLight.setForeground(Color.BLACK);
		
		if(redLight.getState() == true) 
		{
			redLight.setForeground(Color.RED);
			msg.setForeground(Color.RED);
			msg.setText("STOP");
                      setBackground(Color.RED);
		}
		else if(yellowLight.getState() == true) 
		{
			yellowLight.setForeground(Color.YELLOW);
			msg.setForeground(Color.YELLOW);
			msg.setText("READY");
                          setBackground(Color.YELLOW);     
		}
		else
		{
			greenLight.setForeground(Color.GREEN);
			msg.setForeground(Color.GREEN);
			msg.setText("GO");
                        setBackground(Color.GREEN);
		}
	}

	public static void main(String args[])
	{
		Traffic tf=new Traffic();
		tf.setSize(500,600);
		tf.setTitle("Traffic Light");
		tf.setVisible(true);
	}
}
