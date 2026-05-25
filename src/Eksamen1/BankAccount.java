package Eksamen1;

    public class BankAccount {
        private String owner;
        private double balance;

        public BankAccount(String owner, double balance){
            this.owner = owner;
            this.balance = balance;
        }

        public void deposit(double amount){
            balance = balance + amount;
        }

        public void withdraw(double amount){
            if(balance >= amount){
                balance = balance - amount;
            } else {
                System.out.println("Ikke nok penge på kontoen");
            }
        }

        public void transfer(BankAccount target, double amount){
            if(balance >= amount){
                target.deposit(amount);
                withdraw(amount);
            } else {
                System.out.println("Overførslen mislykkes");
            }
        }

        public double getBalance(){
            return balance;
        }
    }
