package java8.lambda;

@FunctionalInterface
public interface DiamondFunctionalInterface {

    int performOperation(int param1, int param2);

    default void useLambda(int result) {
        System.out.println("Lambda expression operation result from DiamondFunctionalInterface is:"+ result);
    }
}
