import aec.ece.d.arthimetic.operations
class Operators1
{
public static void main(Strings args[])
{ 
  int n1,n2,ma;
   Scanner sc=new Scanner(System.in);
    n1=sc.nextInt();
    n2=sc.nextInt();
  operations o=new operations();
ma=o.add(n1,n2);
System.out.println("Sum "+ma);
}
}
