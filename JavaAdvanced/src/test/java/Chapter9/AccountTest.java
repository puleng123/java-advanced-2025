package Chapter9;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    static BankAccount objAccount;

    @BeforeEach
    void setUp(){
        objAccount = new BankAccount("jOHN", "123456", AccountType.CHEQUE, 10000);
    }

    @AfterEach
    void getCurrentAccountData(){
        System.err.println(objAccount.displayDetails() );
    }

    @Test
    @DisplayName("Test Account - Invalid name")
    void testInvalidAccountHolder(){

        //Actual
        assertThrows(IllegalArgumentException.class,
                ()->objAccount.setAccHolder("Joe"));
    }

    @Test
    @DisplayName("Test AccDeposit")
    void testAccDeposit(){

        //Arrange
        double amountToDeposit = 2000;
        double expectedBalance = 12000;

        //Actual
        objAccount.deposit(amountToDeposit);
        double actualBalance = objAccount.getBalance();

        //Assert
        assertEquals(expectedBalance, actualBalance);
    }

    @Test
    @DisplayName("Test Withdrawal")
    void testWithdrawal(){
        //Arrange
        double amountToWithdraw = 1000;
        double expectedBalance = 9000;

        //Actual
        objAccount.withdrawal(amountToWithdraw);
        double actualBalance = objAccount.getBalance();

        //Assert
        assertEquals(expectedBalance, actualBalance);
    }


    @Test
    @DisplayName("Test Transfer")
    void testTransfer() {
        // Arrange
        BankAccount targetAccount = new BankAccount("Alice", "654321", AccountType.SAVINGS, 5000);

        double amountToTransfer = 3000;

        double expectedSourceBalance = 10000 - amountToTransfer;
        double expectedTargetBalance = 5000 + amountToTransfer;

        objAccount.transfer(targetAccount, amountToTransfer);
        double actualSourceBalance = objAccount.getBalance();
        double actualTargetBalance = targetAccount.getBalance();

        // Assert
        assertEquals(expectedSourceBalance, actualSourceBalance,
                "Source account balance should decrease by the transfer amount");
        assertEquals(expectedTargetBalance, actualTargetBalance,
                "Target account balance should increase by the transfer amount");
    }

    @Test
    void testAccountNumberPrefix(){
        String accountnumber = "123456";
        String accountHolder = "John Smith";
        double balance = 5000;

        BankAccount objLoan = new BankAccount(accountHolder, accountnumber, AccountType.LOAN, balance);
        BankAccount objDebit = new BankAccount(accountHolder, accountnumber, AccountType.DEBIT, balance);
        BankAccount objCheque = new BankAccount(accountHolder, accountnumber, AccountType.CHEQUE, balance);
        BankAccount objCredit = new BankAccount(accountHolder, accountnumber, AccountType.CREDIT, balance);
        BankAccount objSavings = new BankAccount(accountHolder, accountnumber, AccountType.SAVINGS, balance);
        BankAccount objNull = new BankAccount(accountHolder, null, null, balance);

        assertAll(

                ()-> assertEquals("LN-" + accountnumber, objLoan.getAccNumber()),
                ()-> assertEquals("DB-" + accountnumber, objDebit.getAccNumber()),
                ()-> assertEquals("CQ-" + accountnumber, objCheque.getAccNumber()),
                ()-> assertEquals("CR-" + accountnumber, objCredit.getAccNumber()),
                ()-> assertEquals("SV-" + accountnumber, objSavings.getAccNumber()),
                ()-> assertEquals(null, objNull.getAccNumber())


        );

    }
}

