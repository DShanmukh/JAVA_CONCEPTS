interface inf1
{
void method1();
void method2();
}
class Provider implements inf1
{
  public void method1()
{
System.out.println("Hello!");
}
public void method2()
{
System.out.println("Welcome to my world");
}
}
class Interface
{
 public static void main(String args[])
{
inf1 i1;
i1=new Provider();
i1.m1();
i1.m2();
}
}
