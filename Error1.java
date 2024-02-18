import java.util.Scanner;
class Error1
{
 public static void main(String args [])
{
int x,y,z;
Scanner sc=new Scanner(System.in);
try
{
x=sc.nextInt();
y=sc.nextInt();
z=x/y;
}
catch(Exception e)
{
System.out.println(e);
z=1;
}
System.out.println(z);
}
}
