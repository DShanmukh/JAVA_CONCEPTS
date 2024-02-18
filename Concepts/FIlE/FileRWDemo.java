import java.io.*;
public class FileRWDemo
{
	public static void main(String[] args)throws Exception
	{
		FileReader fr = null;
		FileWriter fw = null;
		try {
				fr = new FileReader("cricket.txt");
				fw = new FileWriter("characteroutput.txt");
				int c;
				while((c = fr.read()) != -1)
				{
					fw.write(c);
				}
			}
			catch(Exception e)
			{
				System.err.println(e);
			}
			finally
			{
				fr.close();
				fw.close();
			}
	}
}
