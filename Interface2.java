interface inf1
{
void m1();
void m2();
}
interface inf2
{
void m2();
void m3();
}
class Provider implements inf1,inf2
{
public void m1()
{
System.out.println("Hello");
}
public void m2()
{
System.out.println("Good Morning");
}
public void m3()
{
System.out.println("Welcome to java");
}
}
class Interface2
{
public static void main(String args[])
{
inf1 i1;
inf2 i2;
i1=new Provider();
i1.m1();
i1.m2();
i2=new Provider();
i2.m2();
i2.m3();
}
}
