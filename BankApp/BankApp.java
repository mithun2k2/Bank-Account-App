package BankApp;

public class BankApp {

    public static void main(String[] args){

    // Create Bank Account object
    BankAccount acc1 = new BankAccount("123", "Hassan");
    BankAccount acc2 = new BankAccount("254", "Mahi");

    // Display account details

    System.out.println("Account details before transaction");
    System.out.println("Account 1 Name is " + acc1.getAccountName());
    System.out.println("Account 1 Number is " + acc1.getAccountNumber());
    System.out.println("Account 1 Balance is " + acc1.getBalance());
    System.out.println("Account 2 Name is " + acc2.getAccountName());
    System.out.println("Account 2 Number is " + acc2.getAccountNumber());
    System.out.println("Account 2 Balance is " + acc2.getBalance());


    // Deposit money into accounts

    acc1.deposit(500);
    acc2.deposit(1000);

    // Display account details after deposits

    System.out.println("Account details after deposits: ");

    System.out.println("Account 1 Balance is " + acc1.getBalance());
    System.out.println("Account 2 Balance is " + acc2.getBalance());

    // Withdraw money from accounts

    acc1.withdraw(200);
    acc2.withdraw(500);

    // Display account details after withdraw

    System.out.println("Account details after withdraw: ");

    System.out.println("Account 1 Balance is " + acc1.getBalance());
    System.out.println("Account 2 Balance is " + acc2.getBalance());
    
    }

}
