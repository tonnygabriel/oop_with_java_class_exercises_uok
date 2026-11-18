public class BankAccount {

    private String accountNumber;
    private double balance;

    BankAccount(String accNo, double bal){
        this.accountNumber = accNo;
        this.balance = bal; 
    }

    public void deposit(double invoice){
        balance += invoice;
    }
    
    public void withdraw(double amount){
        if(balance - amount < 100){
            System.out.println("Account balance can not go below 100!");
        }else{
            balance -= amount;
            System.out.println("You've withdrawn: " + amount);
            System.out.println("New balance: " + balance);
        }
    }

    public double getBalance(){
        return balance;
    }
}
