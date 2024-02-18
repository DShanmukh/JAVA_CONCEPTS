import java.io.*;
class FileWriterDemo
{
	public static void main(String args[])throws Exception
	{
		FileWriter fw=new FileWriter("PriyankaMohan.txt");
		/*fw.write(69);
		fw.write("ngineering Courses\nCSE\nIT\n");
		char ch[]={'E','C','E'};
		fw.write(ch);
		fw.write("\n");*/
		fw.write("Doctor\n");
		fw.write("ET\n");
		fw.write("Don");
		fw.flush();
		fw.close();
	}
}
