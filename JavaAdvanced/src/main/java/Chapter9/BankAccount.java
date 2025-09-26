package Chapter9;

enum AccountType {
    DEBIT, SAVINGS, CREDIT, LOAN, CHEQUE
}

public class BankAccount {
    private String accHolder;
    private String accNumber;
    private AccountType accType;
    private double balance;

    public BankAccount(String holder, String number, AccountType type, double balance) {
        setAccType(type);
        setAccHolder(holder);
        setAccNumber(number);
        setBalance(balance);
    }

    public void setBalance(double bal) {
        this.balance = bal;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setAccHolder(String holder) {
        if (holder.length() < 4) {
            throw new IllegalArgumentException("Account holder name should at least be 4 characters");
        }
        this.accHolder = holder;
    }

    public String getAccHolder() {
        return this.accHolder;
    }

    private void setAccNumber(String number) {
        String prefix = "";
        if (accType != null) {
            switch (accType) {
                case DEBIT -> prefix = "DB-";
                case SAVINGS -> prefix = "SV-";
                case LOAN -> prefix = "LN-";
                case CHEQUE -> prefix = "CQ-";
                case CREDIT -> prefix = "CR-";
            }
            this.accNumber = prefix + number;
        } else {
            this.accNumber = null;
        }
    }

    public String getAccNumber() {
        return this.accNumber;
    }

    public void setAccType(AccountType type) {
        this.accType = type;
    }

    public AccountType getAccType() {
        return this.accType;
    }

    public void deposit(double amount) {
        setBalance(this.balance + amount);
    }

    public void withdrawal(double amount) throws InsufficientFundsException {
        if (amount > this.balance) {
            throw new InsufficientFundsException(
                    "Insufficient funds! Available balance: " + this.balance);
        }
        setBalance(this.balance - amount);
    }

    public void transfer(BankAccount targetAcc, double amount) throws InsufficientFundsException {
        this.withdrawal(amount);
        targetAcc.deposit(amount);
    }

    public String displayDetails() {
        return "\nAccount Holder: " + getAccHolder() + " (" + getAccNumber() + ")" +
                "\nAccount Type: " + getAccType().name() +
                "\nBalance: " + getBalance();
    }
}
