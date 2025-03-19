package programs;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Hello";
        StringBuilder reverse = new StringBuilder();
        for (int i=str.length()-1; i >=0; i--){
            reverse.append(str.charAt(i));
        }
        System.out.println("For loop reverse string=>"+ reverse);
        usingStringBuilder(str);
        usingSwap(str);
    }

    static void usingStringBuilder(String input){
        StringBuilder stringBuilder = new StringBuilder(input);
        System.out.println("String builder reverse String=>"+stringBuilder.reverse());
    }

    static void usingSwap(String input){
        char[] charArray = input.toCharArray();
        int left = 0, right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed: " + new String(charArray));
    }
}
