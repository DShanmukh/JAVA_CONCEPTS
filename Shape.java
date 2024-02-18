import java.util.Scanner;
 class Shape
{
int s1,s2;
float area;
final float pi=3.14f;
Scanner sc=new Scanner(System.in);
public abstract void get_Input();
public abstract void cal_Area();
public void show_Area()
{
      System.out.println("Area "+area);
}
}
class Circle extends Shape
{
public void get_input()
{
System.out.println("Enter the radius of the circle ");
s1=sc.nextInt();
}
public void cal_Area()
{
  area=pi*s1*s1;
}
}
class Rectangle extends Shape
{
public void get_input()
{
System.out.println("Enter the length and breadth of the rectangle ");
s1=sc.nextInt();
s2=sc.nextInt();
}
public void cal_Area()
{
  area=s1*s2;
}
}
class  Square extends Shape
{
public void get_input()
{
System.out.println("Enter the length and breadth of the rectangle ");
s1=sc.nextInt();
}
public void cal_Area()
{
  area=s1*s1;
}
}
class Shape
{
public static void main(String args[])
{
Shape s;
s=new Rectangle();
System.out.println("Rectangle:");
s.get_Input();
s.Cal_Area();
s.show_Area();
System.out.println("=============");
Shape s;
s=new Circle();
System.out.println("Circle:");
s.get_Input();
s.Cal_Area();
s.show_Area();
System.out.println("=============");
Shape s;
s=new Square();
System.out.println("Square:");
s.get_Input();
s.Cal_Area();
s.show_Area();
}
}
