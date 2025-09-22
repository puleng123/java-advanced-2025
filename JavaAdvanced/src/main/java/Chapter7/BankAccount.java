package Chapter7;

/**
 * @author Puleng Senyatso
 *
 * - This class demonstrates different access levels
 * Public - Class members can be accessible outside the class
 * Private - Class members are only accessible within the class
 *
 */
public class BankAccount
{
    private String accHolder;
    private String accNumber;
    private String accType;
    private double balance;


    public BankAccount(String holder, String number, String type, double balance)
    {
        setAccHolder(holder);
        setAccNumber(number);
        setAccType(type);
        setBalance(balance);
    }

    public void setBalance(double bal){
        this.balance = bal;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setAccHolder(String holder)
    {
        if(holder.length() < 4){
            System.err.println("Account holder name should at least be 4 characters");
        }else{
            this.accHolder = holder;
        }


    }

    public String getAccHolder(){
        return this.accHolder;
    }


    private void setAccNumber(String number){
        this.accNumber = number;
    }

    public String getAccNumber(){
        return this.accNumber;
    }

    public void setAccType(String type){
        this.accType = type;
    }

    public String getAccType(){
        return this.accType;
    }

    public void deposit(double amount){
        this.balance += amount;

    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    public void transfer(double amount, BankAccount targetAcc){
        this.balance -= amount;
        targetAcc.balance += amount;
           this.withdraw (amount);
           targetAcc.deposit(amount);
    }

    public void displayDetails()
    {
        System.out.println("Account Holder: " + getAccHolder() + " (" + getAccNumber() + ")");
        System.out.println("Account Type: " + getAccType());
        System.out.println("Balance: R" + getBalance());
    }

}
