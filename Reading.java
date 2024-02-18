import java.util.Scanner;
class Reading
{
public static void main(String args[])
{
  int x,y,z;
   int add;
   float average;
   Scanner sc =new Scanner(System.in);
   System.out.println("Enter any Three Numbers");
   x=sc.nextInt();
   y=sc.nextInt();
   z=sc.nextInt();
  add=x+y+z;
  average=x+y/2;
 System.out.println("sum ="+add);
 System.out.println("average ="+average);
sc.close();
 }
}