package programs;

public class Palindrome {
    public static void main(String[] args) {
        String input = "ananad";
        int length = input.length();
        boolean isPalindrom = true;

        for (int i=0; i< length/2; i++){
            if (input.charAt(i) != input.charAt(length-i-1)){
                isPalindrom = false;
                break;
            }
        }
        System.out.println("is palindrom=>"+isPalindrom);
    }
}
