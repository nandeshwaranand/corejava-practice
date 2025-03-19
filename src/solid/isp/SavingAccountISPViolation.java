package solid.isp;

/**
 * Process loan will violate the ISP because, loan will be not supported to the saving account.
 * SavingsAccount should not be forced to implement processLoan().
 * refer {@link LoanAccount}, {@link SavingAccount}
 */
public class SavingAccountISPViolation implements BankServiceISPViolation{
    @Override
    public void deposit(double amount) {
        System.out.println("Deposit successful.");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdraw successful.");
    }

    @Override
    public void sendNotification() {
        System.out.println("Notification sent successful.");
    }

    @Override
    public void processLoan() {
        throw new UnsupportedOperationException("Savings Account does not support loans.");
    }
}
