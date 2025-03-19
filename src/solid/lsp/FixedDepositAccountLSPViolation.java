package solid.lsp;

/**
 * FixedDepositAccount violates LSP because it changes the behavior of withdraw(),
 * making it incompatible with BankAccount.
 */
public class FixedDepositAccountLSPViolation extends BankServiceLSPViolation{

    /**
     * LSP violates due to allowing to change behaviour of whithdraw method
     * @param amount - amount to be withdraw
     * @return exception
     */
    @Override
    public double withdraw(double amount) {
        throw new UnsupportedOperationException("Withdrawals not allowed for Fixed Deposit");
    }
}
