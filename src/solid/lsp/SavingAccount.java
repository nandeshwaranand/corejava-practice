package solid.lsp;

/**
 * Saving account supports both operation withdraw and show balance from grand super class
 */
public class SavingAccount extends WithdrawableService{

    @Override
    double withdraw(double amount) {
        System.out.println("Withdraw successful.");
        return 0;
    }

    @Override
    public double showBalance() {
        System.out.println("Showing Savings Account Balance...");
        return 0;
    }
}
