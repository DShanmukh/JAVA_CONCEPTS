import java.util.Scanner;
class Prime
{
 public static void main(String args[])
{
int n,i,j,count=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=2;i<=n;i++)
{
 count=0;
 for (j=1;j<=n;j++)
{
 if(i%j==0)
{
count++;
}
}
if(count==2)
{
System.out.print(i+" ");
}
}
}
}









