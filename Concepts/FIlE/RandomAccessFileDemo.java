import java.io.*;
class RandomAccessFileDemo
{
public static void main(String args[])
{
RandomAccessFile raf=new RandomAccessFile("D:\T-HUB\JAVA\Concepts\FIlE\\text.txt","rw");
raf.writeInt(11);
raf.writeInt(222);
raf.writeInt(33);
raf.seek(8);
System.out.println(raf.readInt());
}
catch(IOException ex)
{
ex.printStackTrace();
}
}
}