package java8.lambda;

public class DiamondProblem implements LambdaFunctionalInterface, DiamondFunctionalInterface{

    @Override
    public int performOperation(int param1, int param2) {
        return 0;
    }

    /**
     * If two interface contains the same methods then compiler will force to override the method
     * @param result
     */
    @Override
    public void useLambda(int result) {
        LambdaFunctionalInterface.super.useLambda(result);
    }
}
