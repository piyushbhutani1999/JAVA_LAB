package Assignment2;

import java.util.*;

public class Ques7{
    
    public static class Account
    {
        private int id;
        private double balance,annualInterestRate;
        private Date dateCreated;
        
        public Account()
        {
            id = 0;
            balance = 0;
            annualInterestRate = 0;
        }
        public Account(int id,double balance)
        {
            this.id = id;
            this.balance = balance;
            dateCreated = new Date();
        }
        public int getId(){
            return id;
        }
        public double getBalance(){
            return balance;
        }
        public double getAnnualInterestRate(){
            return annualInterestRate;
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
        public Date getDateCreated(){
            return dateCreated;
        }
        public double getMonthlyInterestRate(){
            return (getAnnualInterestRate()/12);
        }
        public double getMonthlyInterest(){
            return ((getBalance()*getMonthlyInterestRate())/100);
      }
        public double withdraw(double amount){
            balance = balance - amount;
            return balance;
        }
        public double deposit(double amount){
            balance = balance + amount;
            return balance;
        }
    }
    public static void main(String args[])
    {
       double bal,interest;
       Account cust1 = new Account(1122,20000);
       cust1.setAnnualInterestRate(4.5);
       bal = cust1.withdraw(2500);
       bal = cust1.deposit(3000);
       interest = cust1.getMonthlyInterest();
       
       System.out.println("Balance in the account of customer is $" + bal);
       System.out.println("Monthly interest provided is  $" + interest);
       System.out.println("Account was created on " + cust1.getDateCreated());
       System.out.println();
    }
}