abstract class Parent
{
  public abstract void m1();
   public void m2()
{
System.out.println("m2 method");
}
}
class  Child extends Parent
{
  public void m1()
{
  System.out.println("overrided m1 method");
}
public void m3()
{
  System.out.println(" m3 method");
}
}
class Abstract1
{
  public static void main (String args[])
{
Parent p=new Child();
p.m1();
p.m2();
//p.m3();
}
}
