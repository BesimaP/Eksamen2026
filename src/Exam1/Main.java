package Exam1;

public class Main {

    public static void main(String [] args){
        BankAccount bankAccount = new BankAccount("5", "Besima", 25000);
        BankAccount bankAccount2 = new BankAccount("4", "Louise", 30000);


        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨START SALDO¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("Besima's saldo before deposit: " + bankAccount.getBalance() + " kr.\n");
        bankAccount.deposit(200);

        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨UPDATE SALDO¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("Besima's saldo after the deposit: " + bankAccount.getBalance() + " kr.\n");

        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨TRANSFER SALDO¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        bankAccount.transfer(bankAccount2,500);
        System.out.println("Louise's saldo after transfer: " + bankAccount2.getBalance() + " kr.");
        System.out.println("Besima's saldo after transfer: " + bankAccount.getBalance() + " kr.");

        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨WITHDRAW SALDO¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        bankAccount.withdraw(30000);
        System.out.println("Besima's saldo after failed withdraw: " + bankAccount.getBalance() + " kr.");
    }
}
