package solid.ocp;

/**
 * Adding a new account type forces us to modify existing code:
 * If we introduce a new account type (e.g., Fixed Deposit), we need to modify this method—breaking OCP.
 * <a href="https://stackify.com/solid-design-open-closed-principle/">...</a>
 */
public class BankServiceOCPViolation {

    private double money = 0;

    public double debit(int debitedMoney){
        money = money + debitedMoney;
        return money;
    }

    public double credit(int creditedMoney){
        money = money + creditedMoney;
        return money;
    }

    public double showBalance(){
        System.out.println("Your Bank Balance is: "+money);
        return money;
    }

    /**
     * Adding a new account type forces us to modify existing code, this will violate OCP
     * @param accountType - type of bank account
     */
    public void calculateInterest(String accountType) {
        if (accountType.equals("Savings")) {
            System.out.println("Calculating Savings Interest...");
        } else if (accountType.equals("Current")) {
            System.out.println("No Interest for Current Account");
        }
    }
}
