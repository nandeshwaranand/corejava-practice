package solid;

import solid.lsp.BankService;
import solid.lsp.SavingAccount;

public class SOLIDPrinciple {

    public static void main(String[] args) {
        BankService bankService = new SavingAccount();
        bankService.showBalance();
    }
}
