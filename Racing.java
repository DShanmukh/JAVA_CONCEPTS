import java.util.Scanner;
class Racing
{
public static void main(String args[])
{
  Float R1,R2,R3,R4,R5;
  Float Average;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Speeds of the Racers");
 R1=sc.nextFloat();
 R2=sc.nextFloat();
 R3=sc.nextFloat();
 R4=sc.nextFloat();
 R5=sc.nextFloat();
Average=(R1+R2+R3+R4+R5)/5;

if(R1>Average)
     System.out.println("R1 Qualified with speed " +R1);
if(R2>Average)
     System.out.println("R2 Qualified with speed " +R2);
if(R3>Average)
     System.out.println("R3 Qualified with speed " +R3);
if(R4>Average)
     System.out.println("R4 Qualified with speed " +R4);
if(R5>Average)
     System.out.println("R5 Qualified with speed " +R5);
sc.close();
 }
}