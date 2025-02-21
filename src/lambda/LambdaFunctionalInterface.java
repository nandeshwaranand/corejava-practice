package lambda;

@FunctionalInterface
public interface LambdaFunctionalInterface {

    int performOperation(int param1, int param2);

    default void useLambda(int result) {
        System.out.println("Lambda expression operation result is:"+ result);
    }
}
