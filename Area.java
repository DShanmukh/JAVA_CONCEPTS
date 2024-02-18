import java.util.Scanner;
class Area
{
int l,b,area;
   public Area()
{
System.out.println("Default");
l=b=1;
}
public Area(int m)
{
System.out.println("Square");
l=m;
b=m;
}
public Area(int n, int k)
{
System.out.println("Rectangle");
l=n;
b=k;
}
public void Cal_Area()
{
 area=l*b;
System.out.println("Area is: "+area);
}
public static void main(String args[])
{
Area a1=new Area(5);
a1.Cal_Area();
Area a2=new Area(3,4);
a2.Cal_Area();
Area a3=new Area();
a3.Cal_Area();
}
}
