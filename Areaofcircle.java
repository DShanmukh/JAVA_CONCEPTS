import java.util.Scanner;
class Areaofcircle
{
    public static void main(String arg[])
    {
        int radius;
        float pi=3.14f, area;
      System.out.println("radius value ");
        Scanner sc=new Scanner(System.in);
        radius=sc.nextInt();
        area=pi*radius*radius;
        System.out.println("area of the circle" +area);
        
        
    }
}