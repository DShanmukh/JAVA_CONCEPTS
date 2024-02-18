interface inf1
{
void method1();
}
interface inf2 extends inf1
{
void method2();
}
class Provider implements inf2
{
  public void method1()
{
System.out.println("Method m1() called ");
}
public void method2()
{
System.out.println("Method m2() called");
}
}
class Interface1
{
 public static void main(String args[])
{
inf2 i;
i=new Provider();
i.method1();
i.method2();
}
}
