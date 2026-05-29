package Eksamen1;

    public class SavingsAccount extends BankAccount {
        private double interestRate;

        public SavingsAccount(String accountNumber, String owner, double balance, AccountType accountType){
            super(accountNumber, owner, balance, accountType);
            this.interestRate = interestRate;
        }

        public void addInterest(){
            double interest = getBalance() * interestRate;
            deposit(interest);
        }
    }
