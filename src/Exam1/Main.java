package Exam1;

    public class Main {

        public static void main(String[] args) {
            BankAccount bankAccount = new BankAccount("Besima", 25000);
            BankAccount bankAccount2 = new BankAccount("Louise", 30000);


            System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨START BALANCE¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
            System.out.println("Besima's balance before deposit: " + bankAccount.getBalance() + " kr.\n");
            bankAccount.deposit(200);

            System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨UPDATED BALANCE¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
            System.out.println("Besima's balance after the deposit: " + bankAccount.getBalance() + " kr.\n");

            System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨TRANSFER BALANCE¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
            bankAccount.transfer(bankAccount2, 500);
            System.out.println("Louise's balance after transfer: " + bankAccount2.getBalance() + " kr.");
            System.out.println("Besima's balance after transfer: " + bankAccount.getBalance() + " kr.");

            System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨WITHDRAW BALANCE¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
            bankAccount.withdraw(30000);
            System.out.println("Besima's balance after failed withdraw: " + bankAccount.getBalance() + " kr.");
        }

    }
