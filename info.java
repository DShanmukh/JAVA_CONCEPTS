import java.util.Scanner;
class info
{
  public static void main (String args[])
{
  String rollno,name,branch,section;
int year,marks;
 Scanner sc =new Scanner(System.in);
 System.out.println("Enter rollno,name,branch,section");
 rollno=sc.nextLine();
 name=sc.nextLine();
 branch=sc.nextLine();
 section=sc.nextLine();
 System.out.println("Enter year and marks");
 year=sc.nextInt();
 marks=sc.nextInt();
System.out.println("roll no is "+rollno);
System.out.println("name no is "+name);
System.out.println("branch is "+branch);
System.out.println("section is "+section);
System.out.println("year is "+year);
System.out.println("marks is "+marks);
sc.close();
}
}