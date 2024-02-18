import java.util.Scanner;
class Armstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num,sum=0,rem,temp,d;
System.out.println("Enter a number");
num=sc.nextInt();
d=(int)Math.log10(num)+1;
temp=num;
while(num>0)
{
rem=num%10;
sum=sum+(int)Math.pow(rem,d);
num=num/10;
}
if(sum==temp)
System.out.println("Armstrong Number");
else
System.out.println(" not an Armstrong");
}
}