public class Account {
    private double balance;

    // Constructor with no arguments
    public Account() {
        this.balance = 0;
    }
    public Account(double initialBalance) {
        this.balance = initialBalance;

    }

    //Method to withdraw from the balance
    public void withdraw(double amount){
         if(amount > 0 && amount <= balance){
             balance -= amount;
             System.out.println("Withdraw Successful. Available balance : "+ balance);
         }else {
             System.out.println("Withdraw Failed. Insufficient balance : ");
         }
    }

    // Method to deposit
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposit Succesful.New balance : "+ balance);
        }else{
            System.out.println("Invalid deposit amount:");
        }
    }

    public static void main(String[] args) {
        //creating account objects using constructors both

        Account acc1 = new Account(); // no argument constructor
        Account acc2 = new Account(2000); // 2 argument constructors with initial balance


        //Deposit and withdraw from accounts
        acc1.deposit(500);
        acc1.withdraw(300);

        acc2.deposit(2000);
        acc2.withdraw(500);

    }
}
