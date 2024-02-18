import java.io.*;
class FIFO
{
	public static void main(String args[])throws Exception
	{
		FileInputStream fis=new FileInputStream("One.jpg");
		FileOutputStream fout=new FileOutputStream("Duplicate.jpg");

        int i;
		i=fis.read();
		while(i!=-1)
		{
            fout.write(i);
			i=fis.read();
		}
        System.out.println("Image copies Successfully");
		fis.close();
		fout.close();

	}
}