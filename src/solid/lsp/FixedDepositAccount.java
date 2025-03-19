package solid.lsp;

/**
 * Fixed deposit account does not supports withdraw operation so extending onlu bank service for
 * common operations.
 * Now, SavingsAccount supports withdrawal, but FixedDepositAccount does not.
 */
public class FixedDepositAccount extends BankService{

    @Override
    double showBalance() {
        System.out.println("Showing Fixed Deposit Account Balance...");
        return 0;
    }
}
