import java.util.Scanner;
class bytes
{
public static void main(String args[])
{
 int t,s,b,total;
 Scanner sc=new Scanner(System.in);
System.out.println("print t,s,b values");
 t=sc.nextInt();
 s=sc.nextInt();
 b=sc.nextInt();
 total=2*t*s*b*512;
System.out.println("total surface ="+total+"bytes");
System.out.println("total surface ="+total/1024+"KB");
System.out.println("total surface ="+total/(1024*1024)+"MB");
System.out.println("total surface ="+(float)total/(1024*1024*1024)+"GB");

sc.close();
}
}

