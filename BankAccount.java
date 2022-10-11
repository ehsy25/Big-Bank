
/**
 * Write a description of class SmallBank here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    // instance variables - replace the example below with your own
    private int balance;
    private String name;

    /**
     * Constructor with only name parameter and sets initial value to 0
     */
    public BankAccount(String name)
    {
        // initialise instance variables
        this.name = name;
        balance = 0;
    }

    /**
     * Constructor that takes both name and balance input
     */
    public BankAccount(String name,int balance)
    {
        // initialise instance variables
        this.name = name;
        this.balance = balance;
    }

    /**
     * method to return current balance of account
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * method to return name of the account holder
     */
    public String getName()
    {
        return name;
    }

    /**
     * mutator method to change name of account holder
     */
    public void changeName(String name)
    {
        this.name = name;
    }

    /**
     * method to return current balance of account
     * conditional used to make sure deposit is greater than 0
     */
    public void addBalance(int deposit)
    {
        if(deposit > 0){
            balance = balance + deposit;
        }
        else{System.out.println("deposit can't be negative");
        }
    }

    /**
     * method to return current balance of account
     * conditional used to check if withdraw is greater than 0
     * and if withdraw is less than total balance
     */
    public void withdraw(int withdraw)
    {if(withdraw <= balance && withdraw > 0 ){
            balance = balance - withdraw;
        }
        else{System.out.println("can not perform");
        }

    }
    
      /**
     * method to print account detail
     * conditional is used to make sure that the method works both when the
     * account2 is null and when it has a value
     * also when account2 is null, it tells that it is null
     */
    /**
     * 
     public void printBankDetails()
    {       
        if(account2 != null){
            System.out.println("name: " + account1.getName() );
            System.out.println("balance: " +account1.getBalance() );
            System.out.println("name: " + account2.getName() );
            System.out.println("balance: " +account2.getBalance() );
        }
        else {
            System.out.println("name: " + account1.getName() );
            System.out.println("balance: " +account1.getBalance() );
            System.out.println("account2 is null");
        }
    } */
}
