import java.util.Scanner;
import Package.Compare;
class Practice3
{
public static void main(String args[])
{
int n1,n2;
Scanner sc=new Scanner(System.in);
Compare c=new Compare();
n1=sc.nextInt();
n2=sc.nextInt();
int max=c.getMax(n1,n2);
int min=c.getMin(n1,n2);
c.getEquals(n1,n2);
System.out.println("Maximum :"+Max);
System.out.println("minimum :"+Min);
}
}