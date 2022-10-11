
/**
 * Write a description of class BigBankTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BigBankTester
{
    // instance variables - replace the example below with your own
    private int x;


    /**
     * Constructor for objects of class BigBankTester
     */
    public BigBankTester()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void test()
    {
        BigBank big = new BigBank();
        big.addAccount("name ",0);
        big.addAccount("name2 ",65);
        big.addAccount("name3 ",150);
        big.printDetail();
        big.get100();
        for(BankAccount bank : big.get100()){
            System.out.println(bank.getName());
        }
        System.out.println("This is total: " + big.getTotal());
         for(BankAccount bank : big.test()){
            System.out.println(bank.getBalance());
        }
        big.remove();
         for(BankAccount bank : big.test()){
            System.out.println(bank.getBalance());
        }
        big.printDetail();
        
    }
}
