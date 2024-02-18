import java.util.Scanner;
class Prime1
{
public static void main(String args[])
{ 
   int i,j,count=0;
  Scanner sc= new Scanner(System.in);
   int n;
  n=sc.nextInt();
for(i=2;i<=n;i++)
{
count=0;
for(j=1;j<=i;j++)
{
 if(i%j==0)

  count++;
}
if (count==2)
     System.out.println(i+" ");
}

}
}
