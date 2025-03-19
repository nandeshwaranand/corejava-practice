package solid.ocp;

/**
 * Overriding calculate method and adding own implementation of interest calculation
 */
public class CurrentAccount extends BankService {

    @Override
    public double calculateInterest() {
        System.out.println("No Interest for Current Account.");
        return 0;
    }
}
