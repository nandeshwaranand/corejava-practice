package java17;

/**
 * The class which extends the sealed class it should be sealed, non-sealed or final
 */
public final class PermitSavingAccount extends SealedLoanAccount {

    @Override
    void processLoan(String accountNumber) {
        System.out.println("Processing loan using saving account..");
    }
}
