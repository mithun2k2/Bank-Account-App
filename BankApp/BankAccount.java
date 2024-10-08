
package BankApp;
public class BankAccount {

    // The attributes
    private String accountNumber;
    private String accountName;
    private double balance;  


    // Creating the constructor method

    public BankAccount(String numberIn, String nameIn){
        accountNumber = numberIn;
        accountName = nameIn;
        balance = 0;
    }
    
    public String getAccountName(){
        return accountName;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    // Methods to deposit and withdraw money
    
    public void deposit(double amountIn){
        balance = balance + amountIn;
    }

    public void withdraw( double amountIn){
        if(amountIn <= balance)
        {
            balance = balance - amountIn;
        }

      
    }

}
