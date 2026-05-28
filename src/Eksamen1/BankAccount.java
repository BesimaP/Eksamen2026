package Eksamen1;

import java.util.ArrayList;

public class BankAccount implements Account {
        private String owner;
        private double balance;
        private String accountNumber;
        private static final double FEE = 10;
        private AccountType accountType;
        private ArrayList<String> history;

        public BankAccount(String accountNumber, String owner, double balance, AccountType accountType){
            this.accountNumber = accountNumber;
            this.owner = owner;
            this.balance = balance;
            this.accountType = accountType;
            this.history = new ArrayList<>();
        }

        @Override
        public void deposit(double amount){
            if(amount > 0){
                balance = balance + amount;
                history.add("Indsat: " + amount + " kr.");
            }

        }

        @Override
        public boolean withdraw(double amount){
           if(balance >= amount + FEE && amount > 0){
               balance = balance - amount - FEE;
               history.add("Trukket: " + amount + " kr. (gebyr: " + FEE + " kr.)");
               return true;
           }  else {
               System.out.println("Ikke nok penge på kontoen");
               return false;
           }
        }

        @Override
        public void transfer(Account target, double amount){
            boolean lykkedes = this.withdraw(amount);
            if(lykkedes){
                target.deposit(amount);
                history.add("Overført: " + amount + " kr. til konto " + target.getAccountNumber());
            } else {
                System.out.println("Overførslen mislykkes");
            }
        }

        public double getBalance(){
            return balance;
        }

        public String getOwner(){
            return owner;
        }

        public String getAccountNumber(){
            return accountNumber;
        }

        public ArrayList<String>getHistory(){
           return history;
        }

        public void printHistory(){
            for(String transaktion : history){
                System.out.println(transaktion);
            }
        }

        @Override
        public String toString() {
            return accountNumber + "-" + owner + ": " + balance + " kr.";
        }
    }
