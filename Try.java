class Try
{
 public static void main(String args[])
{
try 
{
int x=10/0;
System.out.println("try");
}
catch(Exception e)
{
System.out.println("Catch"+e+" ");
}
finally
{
System.out.println("Finally");
}
}
}