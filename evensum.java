class evensum
{
public static void main(String args[])
{
 int e_sum=0,o_sum=0;
 System.out.println("No of commands ="+args.length);
for(int i=0;i<args.length;i++)
{
   int x=Integer.parseInt(args[i]);
   if(x%2==0)
    e_sum+=x;
   else
    o_sum+=x;
}
 System.out.println("e_Sum ="+e_sum);
System.out.println("o_Sum ="+o_sum);
}
}