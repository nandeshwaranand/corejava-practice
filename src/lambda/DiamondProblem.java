package lambda;

public class DiamondProblem implements LambdaFunctionalInterface{

    @Override
    public int performOperation(int param1, int param2) {
        return 0;
    }

    @Override
    public void useLambda(int result) {
        LambdaFunctionalInterface.super.useLambda(result);
    }
}
