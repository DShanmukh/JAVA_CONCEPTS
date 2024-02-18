import java.util.Scanner;
class Fibannoci
{
public static void main(String args[])
{
int n1=0,n2=1,n3,n,sum=0;
n3=n1+n2;
Scanner sc =new Scanner(System.in);
n=sc.nextInt();
while(n3<=n)
{
if(n3%2==0)
sum=sum+n3;
  n1=n2;
 n2=n3;
n3=n1+n2;
}
System.out.println(sum);
}
}