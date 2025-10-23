class SavingsAccount
{
private double balance;
private double interest;
public SavingsAccount()
{
balance=0;
interest=0;
}
public SavingsAccount(double initialBalance ,double initialInterest)
{
balance=initialBalance;
interest=initialInterest;
}
public void deposite(double amount)
{
balance=balance+amount;
}
public void withdraw(double amount)
{
balance=balance-amount;
}
public void addInterest()
{
balance=balance+balance*interest;
}
public double getBalance()
{
return balance;
}
}
class SavingsAccountTester
{
public static void main(String[]args)
{
SavingsAccount Savings=new SavingsAccount(1000,0.1);
Savings.withdraw(250);
Savings.deposite(400);
Savings.addInterest();
System.out.println(Savings.getBalance());
System.out.println("Expected:1265.0");
}
}
