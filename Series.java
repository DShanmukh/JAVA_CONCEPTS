import java.util.Scanner;
class Series 
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int sum=0,i;
        for(i=0;i<=n;i++)
        {
      System.out.println(i);
        }
     for(i=0;i<=n;i++)
{
sum=0;
     sum=sum+1/i;
    }
System.out.println(sum);
}
}