package java8.lambda;

public class LambdaExample {
    public static void main(String[] args) {
        System.out.println("Single Line Lambda Expression Example.");
        LambdaFunctionalInterface additionLambda = Integer::sum;
        int x = additionLambda.performOperation(20, 30);
        additionLambda.useLambda(x);

        System.out.println("Multi Line Lambda Expression Example.");
        LambdaFunctionalInterface multiline = (a, b) -> {
            return a * b;
        };
        int result = multiline.performOperation(2, 30);
        multiline.useLambda(result);

        //

    }
}
