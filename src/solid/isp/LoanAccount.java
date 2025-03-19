package solid.isp;

/**
 * Only supported loan account will be implement the loan service
 */
public class LoanAccount implements LoanService{
    @Override
    public void processLoan() {
        System.out.println("Processing Loan...");
    }
}
