import java.util.Scanner;
class Customer
{
String Account_num, name;
float balance;
Scanner sc=new Scanner(System.in);
public void get_CustomerInfo()
{
System.out.println("Enter Customer Account num, Name, and  Balance");
name=sc.nextLine();
Account_num=sc.nextLine();
balance=sc.nextFloat();
}
public void show_CustomerInfo()
{
System.out.println("Account number is : "+Account_num);
System.out.println("Name: "+name);
System.out.println("Balance: "+balance);

}
}
class Transaction extends Customer
{
public void deposit(float amt)
{
System.out.println("Amount Deposited: "+amt);
balance=balance+amt;
}
public void withdraw(float amt)
{
System.out.println("Amount withdrawn: "+amt);
balance=balance-amt;
}
public void show_Bal()
{
System.out.println("Available Balance: "+balance);
}
}
class Bank extends Transaction
{
static String bankname="INDIAN BANK",ifsc="INDB00032698";
public void show_BankInfo()
{
System.out.println("Bank Name: "+Bank.bankname);
System.out.println("IFSC Code: "+Bank.ifsc);
}
public static void main(String args[])
{
Bank c1=new Bank();
c1.get_CustomerInfo();
c1.show_CustomerInfo();
c1.show_BankInfo();
c1.deposit(10000);
c1.show_Bal();
c1.withdraw(5000);
c1.show_Bal();
}
}