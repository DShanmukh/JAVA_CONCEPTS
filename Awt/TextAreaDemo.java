import java.awt.*;
class TextAreaDemo extends Frame 
{
	TextArea text;
	public TextAreaDemo() 
	{
		setLayout(new FlowLayout());
		String val =
		"Java SE 14 is the latest version of the most\n" +
		"widely-used computer language for Internet programming.\n" +
		"Building on a rich heritage, Java has advanced both\n" +
		"the art and science of computer language design.\n\n" +
		"One of the reasons for Java's ongoing success is its\n" +
		"constant, steady rate of evolution. Java has never stood\n" +
		"still. Instead, Java has consistently adapted to the\n" +
		"rapidly changing landscape of the networked world.\n" +
		"Moreover, Java has often led the way, charting the\n" +
		"course for others to follow.";
		
		text = new TextArea(val, 30, 50);
		add(text);
               setBackground(Color.ORANGE);
	}
	public static void main(String args[])
	{
		TextAreaDemo ta=new TextAreaDemo();
		ta.setSize(500,500);
		ta.setTitle("TextAreaDemo");
		ta.setVisible(true);
	}
}
