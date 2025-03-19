package solid.ocp;

/**
 * Overriding calculate method and adding own implementation of interest calculation
 */
public class SavingAccount extends BankService {

    @Override
    public double calculateInterest() {
        System.out.println("Calculating Savings Interest...");
        return 0;
    }
}
