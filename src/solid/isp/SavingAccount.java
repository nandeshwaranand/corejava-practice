package solid.isp;

/**
 * Saving account only responsible for transactional operation not for load processing
 */
public class SavingAccount implements Transactional{
    @Override
    public void deposit() {
        System.out.println("Deposit successful.");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw successful.");
    }
}
