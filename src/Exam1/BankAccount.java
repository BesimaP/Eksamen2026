package Exam1;

    public class BankAccount {
        private String owner;
        private double balance;

        public BankAccount(String owner, double balance){
            this.owner = owner;
            this.balance = balance;
        }

        public void deposit(double amount){
            balance = balance + amount; //tildeling. anden måde man kunne skrive det: balance+= amount
        }

        public void withdraw(double amount){
            if(balance >= amount && amount > 0){ //if-else(betingelser/condition),boolsk udtryk, evaluere udtrykekt evalueres til true eller false, tildeling
                balance = balance - amount;
            } else{
                System.out.println("Insufficient funds in your account");
            }
        }

        public void transfer(BankAccount target, double amount){
            if(this.balance >= amount){
                this.withdraw(amount);
                target.deposit(amount);
            } else {
                System.out.println("Insufficient funds in your account to transfer money");
            }
        }

        public double getBalance() {
            return balance;
        }
    }