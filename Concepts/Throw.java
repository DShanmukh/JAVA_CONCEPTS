class Throw
{
public static void main(String args[])
{
System.out.println("Main Method ");
method1();
System.out.println("Main close");
}
public static void method1()
{
System.out.println("Method 1 Opened ");
try
{
method2();
}
catch(ArrayIndexOutOfBoundsException aoe)
{
System.out.println("Check the index Before accessing the Array");
}
System.out.println("Method1 Closed");
}
public static void method2()throws ArrayIndexOutOfBoundsException
{
System.out.println("Method2 opened");
int x[]=new int[1];
x[1]=10;
System.out.println("Method2 is closed");
}
}
