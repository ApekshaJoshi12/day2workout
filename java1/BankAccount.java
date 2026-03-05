class BankAccount {

    String accountHolder;
    double balance;

    
    BankAccount(String name, double initialBalance) {
        accountHolder = name;
        balance = initialBalance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }

    
    public static void main(String[] args) {

        
        BankAccount acc1 = new BankAccount("Apeksha", 10000);

        acc1.displayBalance();

        acc1.deposit(2000);
        acc1.withdraw(5000);
        acc1.withdraw(8000);  

        acc1.displayBalance();
    }
}