package java17;

/**
 * Enhances the switch statement by allowing pattern matching.
 * Simplifies switch statements with type patterns.
 * No need for explicit casting.
 * Eliminates boilerplate code.
 * More readable and expressive switch statements.
 */
public class PatternMatchingSwitch {

    public void performOperation(Object object){
        System.out.println("Object Name:"+object.getClass().getName());
        switch (object){
            case PermitSavingAccount psa -> psa.show();
            case DeserializedClass dc -> dc.print();
            case PseudoRandomGenerator prg ->  prg.generateRandom();
            default -> throw new IllegalStateException("Unexpected value: " + object);
        }
    }
}
