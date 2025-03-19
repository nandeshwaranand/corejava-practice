package solid.srp;

/**
 * The more responsibilities your class has, the more often you need to change it.
 * Depending on your change, you might need to update the dependencies or
 * recompile the dependent classes even though they are not directly affected by your change.
 */
public class BankServiceSRPViolation {

    private double money = 0;

    public double debit(int debitedMoney){
        money = money + debitedMoney;
        return money;
    }

    public double credit(int creditedMoney){
         money = money + creditedMoney;
        return money;
    }

    public void generateStatement(){
        System.out.println("Generate Statement");
    }

    public void sendEmailNotification() {
        System.out.println("Sending Email Notification...");
    }

    public void calculateInterest(String accountType) {
        if (accountType.equals("Savings")) {
            System.out.println("Calculating Savings Interest...");
        } else if (accountType.equals("Current")) {
            System.out.println("No Interest for Current Account");
        }
    }

    public double showBalance(){
        System.out.println("Your Bank Balance is: "+money);
        return money;
    }
}
