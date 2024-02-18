import java.util.Scanner;
class  BinarySearch
{
public static void main(String args[])
{
 int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[],i;
a=new int[n];
for(i=0;i<n;i++)
a[i]=sc.nextInt();
for(i=0;i<n;i++)
System.out.println(a[i]+ " ");
System.out.println("Enter the binary search value");
int k;
k=sc.nextInt();
for(i=0;i<n;i++)
if(a[i]==k)
 System.out.println("Element found ");
   goto;
else
 System.out.println("Element not found");
}
}