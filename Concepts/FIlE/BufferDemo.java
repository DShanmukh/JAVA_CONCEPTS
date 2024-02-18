import java.io.*; 
class BufferDemo
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br; 
		BufferedWriter bw; 
		try
		{ 
			br=new BufferedReader(new FileReader("FileDemo2.java")); 
			bw=new BufferedWriter(new FileWriter("CopyFileDemo2.java")); 
			String str; 
			while((str=br.readLine())!=null) 
			{
				bw.write(str); 
			} 
			br.close(); 
			bw.close(); 
		} 
		catch(Exception e) 
		{ 
			System.out.println("getting Exception"); 
		} 
	} 
}
