package solid.isp;

/**
 * Multiple operations/responsibilities given to single interface, this will lead you to
 * force the implementation.
 * Solution : Split the interface into smaller, more specific interfaces:
 * refer {@link Transactional} {@link LoanService}
 */
public interface BankServiceISPViolation {

    void deposit(double amount);

    void withdraw(double amount);

    void sendNotification();

    void processLoan();
}
