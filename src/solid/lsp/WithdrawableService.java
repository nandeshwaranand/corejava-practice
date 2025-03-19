package solid.lsp;

/**
 * Introduce a hierarchy where only withdrawable accounts inherit from BankAccount
 */
public abstract class WithdrawableService extends BankService{

    abstract double withdraw(double amount);
}
