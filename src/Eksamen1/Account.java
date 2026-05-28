package Eksamen1;

    public interface Account {
        String getAccountNumber();
        void deposit(double amount);
        boolean withdraw(double amount);
        void transfer(Account target, double amount);
    }
