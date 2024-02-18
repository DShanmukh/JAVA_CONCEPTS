import java.util.*;
interface Internal
{
void get_InternalMarks();
}
interface External
{
void get_ExternalMarks();
}
interface Marks extends Internal, External
{
void show_Marks();
}
class Result implements Marks
{
float s1_i,s1_e,s2_i,s2_e,s3_i,s3_e;
Scanner sc=new Scanner(System.in);
public void get_InternalMarks()
{
System.out.println("Enter 3 subjects internal marks upto 40)");
s1_i=sc.nextFloat();
s2_i=sc.nextFloat();
s3_i=sc.nextFloat();
}
public void get_ExternalMarks()
{
System.out.println("Enter 3 subjects External marks upto 60");
s1_e=sc.nextFloat();
s2_e=sc.nextFloat();
s3_e=sc.nextFloat();
}
public void show_Marks()
{
System.out.println("Subject    Internal   External   FinalMarks: ");
System.out.println(" Sub1  "+s1_i+" "+s1_e+" "+(s1_i+s1_e));
System.out.println(" Sub2  "+s2_i+" "+s2_e+"  "+(s2_i+s2_e));
System.out.println(" Sub3  "+s3_i+" "+s3_e+" "+(s3_i+s3_e));
}
}
class Mainclass
{
public static void main(String args[])
{
Marks m=new Result();
m.get_InternalMarks();
m.get_ExternalMarks();
m.show_Marks();
}
}