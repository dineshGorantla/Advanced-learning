package com;

public class BankAccount {
	int account_number;
    String name;
    String account_type;
    double balance;
   
    public int getAccount_number() {
        return account_number;
    }
   
    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }
   
    public String getName() {
        return name;
    }
   
    public void setName(String name) {
        this.name = name;
    }
   
    public String getAccount_type() {
        return account_type;
    }
   
    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }
   
    public double getBalance() {
       
        if( balance <1000)
        {
        try
        {   
            throw new NumberFormatException();
        }
        catch(NumberFormatException e)
        {
            System.out.println("Balance is low"+balance);
        }
        }
       
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    //constructor
    public BankAccount() {
       
        this.account_number = 100000;
        this.name = "Dinesh";
        this.account_type = "Saving";
        this.balance = 2000;
    }
    public BankAccount(int account_number, String name, String account_type,
            double balance) {
       
        this.account_number = account_number;
        this.name = name;
        this.account_type = account_type;
        this.balance = balance;
    }
    void deposit(double amount)
    {
        if(amount<0)
        {
            try
            {
                throw new NumberFormatException();
            }
            catch(NumberFormatException e)
            {
                System.out.println("Negative Amount cannot be deposited");
            }
        }
        else
        {
            balance=getBalance()+account_number;
            System.out.println("Current balance is ="+balance);
           
        }
    }
     public void withdraw(double amt){
         if(amt>1000)
            {
                try
                {
                    throw new NumberFormatException();
                }
                catch(NumberFormatException e)
                {
                    System.out.println("INSUFFICENT BALANCE");
                }
            }
            else
            {
                balance=getBalance()-amt;
                System.out.println("Current balance is ="+balance);  
            }   
    }
     void display()
     {
    System.out.println("Balance is ="+getBalance());   
     }
    public static void main(String[] args) {
       
        BankAccount b=new BankAccount();
        b.deposit(2000);
        b.display();
        b.withdraw(500);
        b.display();
        b.withdraw(2000);
        b.getBalance();
        b.display();  
    }
}
