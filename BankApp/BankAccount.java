package BankApp;

public class BankAccount {

    // The attributes
    private String accountNumber;
    private String accountName;
    private double balance;  
}

    // Creating the constructor method

    public BankAccount(String numberIn, String nameIn){
        accountNumber = numberIn;
        accountName = nameIn;
        balance = 0;
    }



