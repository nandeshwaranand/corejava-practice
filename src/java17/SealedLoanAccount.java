package java17;

/**
 * Sealed classes and interfaces allow developers to control which classes can extend or implement them.
 * Restricts which classes can extend or implement a class or interface.
 * Helps in defining a strict hierarchy for better maintainability.
 * The class which extends the sealed class it should be sealed, non-sealed or final
 */
public abstract sealed class SealedLoanAccount permits PermitSavingAccount {

    public void show(){
        System.out.println("Show method called from parent sealed class.");
    }

    abstract void processLoan(String accountNumber);

}
