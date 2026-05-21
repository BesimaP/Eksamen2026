package Exam1;

public class BankAccount {
    private String owner;
    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, String owner, double balance){
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount){
        if(amount > 0 ) {
            balance = balance + amount; //tildeling. anden måde man kunne skrive det: balance+= amount
        } else {
            System.out.println("Du har ikke penge nok på kontoen");
        }
    }

    public void withdraw(double amount){
        if(balance >= amount && amount > 0){ //if-else(betingelser/condition),boolsk udtryk, evaluere udtrykekt evalueres til true eller false, tildeling
            balance = balance - amount;
        } else{
            System.out.println("Du har ikke penge nok på kontoen");
        }
    }

    public void transfer(BankAccount target, double amount){
        if(this.balance >= amount){
            this.withdraw(amount);
            target.deposit(amount);
        } else {
            System.out.println("Du har ikke penge nok på kontoen til at overføre penge");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
}
