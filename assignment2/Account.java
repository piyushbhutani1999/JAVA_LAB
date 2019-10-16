import java.util.*;

    
public class Account
{
    private int id;
    private double balance,annualInterestRate;
    private Date dateCreated;
    
    public Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }
    public Account(int id,double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }
    public void setId(int newId){
        this.id = newId;
    }
    public void setBalance(double newbalance){
        this.balance = newbalance;
    }
    public void setAnnualInterestRate(double interest){
        this.annualInterestRate = interest;
    }    
    public int getId(){
        return this.id;
    }
    public double getBalance(){
        return this.balance;
    }
    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return (getAnnualInterestRate()/12);
    }
    public double getMonthlyInterest(){
        return ((getBalance()*getMonthlyInterestRate())/100);
    }
    public double deposit(double amount){
        balance = balance + amount;
        return balance;
    }
    public double withdraw(double amount){
        balance = balance - amount;
        return balance;
    }

    public static void main(String args[])
    {
       double bal,interest;
       Account cust1 = new Account(11812090,1000);
       cust1.setAnnualInterestRate(9.5);
       bal = cust1.withdraw(2500);
       bal = cust1.deposit(3000);
       interest = cust1.getMonthlyInterest();
       
       System.out.println("Balance  = " + bal);
       System.out.println("Monthly interest  = " + interest);
       System.out.println("Account created date =  " + cust1.getDateCreated());
       System.out.println();
    }
}