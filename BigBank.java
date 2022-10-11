import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class BigBank here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BigBank
{
    // instance variables - replace the example below with your own
    private int x;
    ArrayList <BankAccount> accounts = new ArrayList<BankAccount>(); 

    /**
     * Constructor for objects of class BigBank
     */
    public BigBank()
    {
        // initialise instance variables
        ArrayList <BankAccount> accounts = new ArrayList<BankAccount>(); 
    }

    /**
     * method to add new account to arryalist
     */
    public void addAccount(String name, int balance)
    {
        accounts.add(new BankAccount(name, balance));
    }

    /** 
     * method to print out details of account with for each loop
     */
    public void printDetail(){
        for(BankAccount account: accounts){
            System.out.println("Name: " + account.getName() );
            System.out.println("Balance: " + account.getBalance());
        }
    }

    /**
     * method to select accounts with balance lower than 100 and return them
     * shame the poor
     */
    public ArrayList<BankAccount> get100(){
        ArrayList <BankAccount> test = new ArrayList<BankAccount>(); 

        for (BankAccount account: accounts){
            if (account.getBalance() < 100){
                test.add(account);
            }
        }

        return test;
    }

    /**
     * method to iterate through the arraylist and add the values of the
     * balance of each account to an int variable and return the said int
     * variable
     */
    public int getTotal() {
        int sum = 0;
        for (BankAccount account: accounts){
            sum = sum + account.getBalance();
        }
        return sum;
    }
    
    /**
     * method to iterate through the arraylist and use a conditional to
     * remove any acconut with a balance of 0 from the arraylist
     */
    public void remove() {
        
        for (BankAccount account: accounts){
            if(account.getBalance() == 0){
                accounts.remove(account);
            }
        }
        
    }
    
    /**
     * test method to access array values
     */
    public ArrayList<BankAccount> test(){
        return accounts;
    }
}

