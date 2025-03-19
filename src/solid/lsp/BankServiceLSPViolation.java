package solid.lsp;

public class BankServiceLSPViolation {

    double bankBalance = 0;

    public double debit(int amount){
        bankBalance = bankBalance + amount;
        return bankBalance;
    }

    public double credit(int amount){
        bankBalance = bankBalance + amount;
        return bankBalance;
    }

    public double showBalance(){
        System.out.println("Your Bank Balance is: "+bankBalance);
        return bankBalance;
    }

    /**
     * Withdraw is not applicable for all account types
     * @param amount - amount to be withdraw
     * @return balance
     */
    public double withdraw(double amount){
        bankBalance -= amount;
        System.out.println("Withdraw of amount "+ amount + " is successful");
        return bankBalance;
    }
}
