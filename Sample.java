class Sample 
{
 int x;
 public Sample()
{
x=10;
}
public Sample(int x)
{
 this.x=x;
}
public void show()
{
System.out.println(this.x);
}
 public static void main(String args[])
{
      Sample s1=new Sample();
     Sample s2=new Sample(20);
    s1.show();
  s2.show();
}
}