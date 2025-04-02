package strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringMultiplication {

    public static void main(String[] args) {

        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStream);
        try {
            String input = bufferedReader.readLine();
            System.out.println("Input: "+input);
            String[] numArray = input.split(" ");
            System.out.println("String Multiplication:"+multiplyStrings(numArray[0],numArray[1]));

            long number1 = Long.parseLong(numArray[0]);
            long number2 = Long.parseLong(numArray[1]);

            System.out.println("Number1:"+ number1);
            System.out.println("Number2:"+ number2);

            multiply(number1, number2);
        }catch (Exception exception){
            System.out.println("Exception:"+exception.getMessage());
            throw new IllegalArgumentException("Invalid number provided for the operations.");
        }
    }

    static void multiply(long number1, long number2 ){
        long result = number1 * number2;
        System.out.println("Multiplication result is: "+result);
    }

    public static String multiplyStrings(String num1, String num2) {
        // Handle edge cases where one of the numbers is zero
        if (num1.equals("0") || num2.equals("0")) return "0";

        int len1 = num1.length();
        int len2 = num2.length();
        int[] result = new int[len1 + len2]; // Maximum possible length

        // Reverse multiply each digit
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + result[i + j + 1]; // Add to existing value at the position

                result[i + j + 1] = sum % 10; // Store single digit
                result[i + j] += sum / 10; // Carry over
            }
        }

        // Convert result array to string
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) { // Skip leading zeros
                sb.append(num);
            }
        }

        return sb.toString();
    }
}
