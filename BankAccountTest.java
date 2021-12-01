import java.util.*;

public class BankAccountTest {
    
    public static void main(String[] args) {
    
        BankAccount user1 = new BankAccount(180, 420);
        BankAccount user2 = new BankAccount(150.75, 556.50);
        
        System.out.println(user2.getCheckingBalance());
        user2.deposit(100.25, 0);
        System.out.println(user2.getCheckingBalance());
        user2.withdrawChecking(200);
        System.out.println(user2.getCheckingBalance());
        System.out.println(user2.getTotalBalance());
        
        System.out.println(BankAccount.getNumberOfAccounts());
        System.out.println(BankAccount.getTotalInAllAccounts());
        
    
    }
}
