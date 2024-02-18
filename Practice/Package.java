package Package;
class Compare
{
public int getMax(int n, int m)
{
if(n>m)
   return n;
else 
   return m;
}
public int getMin(int n, int m)
{
if(n<m)
return n;
else
return m;
}
public void getEquals(int n, int m)
{
if(n==m)
  System.out.println("Equal");
else
  System.out.println("Not Equal");
}
}
