package keywords;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            // This will terminate the JVM
            System.exit(0);
            // will immediately stop the JVM without executing the finally block.
            Runtime.getRuntime().halt(0);
        } finally {
            System.out.println("This will not be executed");
        }
    }
}
