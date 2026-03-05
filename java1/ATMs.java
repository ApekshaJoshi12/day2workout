class ATM {

    
    private double balance;

    
    ATM(double balance) {
        this.balance = balance;
    }

    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

   
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Main class
public class ATMs {
    public static void main(String[] args) {

        ATM atm = new ATM(5000);  

        atm.displayBalance();
        atm.withdraw(2000);
        atm.withdraw(4000);  
    }
}