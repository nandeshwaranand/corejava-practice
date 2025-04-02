package programs;

import java.util.HashMap;
import java.util.Map;

/**
 * Find count of each character of string using stream API
 */
public class CharacterCount {

    public static void main(String[] args) {
        String str = "HelLO World".toLowerCase().strip().trim();
        char[] chArray = str.toCharArray();
        Map<Character, Long> charCount = new HashMap<>();

        for(char ch: chArray){
            if(!Character.isWhitespace(ch))
                charCount.put(ch, count(ch, str));
        }
        System.out.println("count:"+ charCount);
        System.out.println("Without Collection...");
        withoutCollection(chArray);
    }
    static long count (char ch, String str){
        return str.chars().filter(c ->  c == ch).count();
    }

    static void withoutCollection(char[] charArray){
        StringBuilder checkedChars = new StringBuilder();
        for (char ch: charArray){
            boolean isUsed = checkedChars.chars().anyMatch(c -> ch ==c); // to avoid duplicate print
            if (!Character.isWhitespace(ch) && !isUsed) {
                int count = 0;
                for (int i = 0; i < charArray.length; i++) {
                    if (ch == charArray[i]) {
                        count++;
                    }
                }
                checkedChars.append(ch);
                System.out.println("Char=" + ch + " Count:" + count);
            }
        }
    }
}
