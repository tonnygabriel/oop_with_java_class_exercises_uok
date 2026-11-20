public class BankInheritance {
    
    public static void main(String[] args) {
        
        SavingAccount acc = new SavingAccount("S001", 5000);

        System.out.println(acc.getBalance());
        acc.deposit(10000);
        System.out.println(acc.getBalance());
        acc.withdraw(15000);
        acc.withdraw(5000);
    }
}
