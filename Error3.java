import java.util.Scanner;
class Error3
{
public static void main(String args[])
{
int x,y,z=0;
try
{
x=Integer.parseInt(args[0]);
y=Integer.parseInt(args[0]);
z=x/y;
}
catch(ArthimeticException ae)
{ 
System.out.println("y should be non zero");
 System.out.println("A");
}
catch(ArthimeticException ae)
{ 
System.out.println("y should be non zero");
 System.out.println("A");
}
catch(ArthimeticException ae)
{ 
System.out.println("y should be non zero");
 System.out.println("A");
}
catch(ArrayIndexOutOfIdexException ae)
{ 
System.out.println("y should be non zero");
 System.out.println("A");
}