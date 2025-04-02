package programs;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctCharacter {

    public static void main(String[] args) {
        String str = "anandnandeshwar";
        Set<Character> unique = new HashSet<>();
        for (Character ch : str.toCharArray()){
            if (!isDuplicate(ch, str)){
                unique.add(ch);
            }
        }
        System.out.println("Avoid Duplicated :"+unique);
    }

    static boolean isDuplicate (char ch, String str){
        return str.chars().filter(c ->  c == ch).count() > 1;
    }

    static void distinct(String str){
        Set<String> unique = str.chars().distinct()
                .mapToObj(c -> String.valueOf((char)c))
                .collect(Collectors.toSet());
        System.out.println(unique);
    }
}
