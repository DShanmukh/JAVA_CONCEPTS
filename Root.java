import java.util.Scanner;
class Root
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
 double a,b,c,root1,root2,root;
System.out.println("Enter a,b,c value");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
root=b*b-4*a*c;
if(root>0)
{
root1=(-b+Math.sqrt(root))/(2*a);
root2=(-b-Math.sqrt(root))/(2*a);
 System.out.format("root1=%.2f and root2=%.2f",root1,root2);
}
else  if(root==0)
{
 root1=-b/(2*a);
root2=-b/(2*a);
System.out.format("root1=%.2f and root2=%.2f",root1,root2);
}
else
{
double real = -b / (2 * a);
double imaginary = Math.sqrt(-root) / (2 * a);
System.out.format("root1 = %.2f+%.2fi", real, imaginary);
System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
}
}
}