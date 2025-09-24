package Chapter7;

public class BankAccountRunner
{
    public static void main(String[] args)
    {
        BankAccount objBank = new BankAccount("Joe Smith", "123456789", "Debit", 5000.89);
        objBank.displayDetails();

        objBank.setBalance(15000.00);
        objBank.setAccHolder("");
        objBank.deposit(500);
        objBank.withdraw(200);

        System.out.println("=========================================");
        objBank.displayDetails();


        System.out.println("Current balance for (" + objBank.getAccHolder() +
                " is R" + objBank.getBalance());

    }
}
