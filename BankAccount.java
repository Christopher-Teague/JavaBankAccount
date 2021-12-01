import java.util.*;

public class BankAccount{

    private double checkingBalance;
    private double savingsBalance;

    private static int numberOfAccounts = 0;
    private static double moneyInAccounts = 0.00;
    
    public BankAccount(double checking, double savings) {
        checkingBalance = checking;
        savingsBalance = savings;
        numberOfAccounts ++;
        moneyInAccounts += (checking + savings);
    }        
    
    // ****** Methods ******
    public void deposit(double checking, double savings) {
        checkingBalance += checking;
        savingsBalance += savings;
        moneyInAccounts += (checking + savings);
    }
    
    public void withdrawChecking(double checking) {
        if (checking > checkingBalance){
            System.out.println("Insufficient Funds!");
        } else {
            checkingBalance -= checking;
            moneyInAccounts -= checking;
        }
    }
    
    public void withdrawSavings(double savings) {        
        if (savings > savingsBalance){
            System.out.println("Insufficient Funds!");
        } else {
            savingsBalance -= savings;
            moneyInAccounts -= savings;
        }       
    }
    
    // ****** Get ******
    public double getTotalBalance() {
        return this.checkingBalance + this.savingsBalance;
    }   
    
    public double getCheckingBalance() {
        return this.checkingBalance;
    }
    
    public double getSavingsBalance() {
        return this.savingsBalance;
    }
    
    // ****** Static ******
    public static int getNumberOfAccounts() {
        return BankAccount.numberOfAccounts;
    }
    
    public static double getTotalInAllAccounts() {
        return BankAccount.moneyInAccounts;
    }          
        
}