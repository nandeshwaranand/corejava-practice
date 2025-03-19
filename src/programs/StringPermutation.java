package programs;

import java.util.Arrays;

/**
 * Write a program to find all permutations of a given string.
 * Avoid duplicates if the string contains repeating characters
 */
public class StringPermutation {

    /**
     * Approach
     * Convert the string into a sorted character array (to handle duplicates).
     * Use backtracking to generate permutations.
     * Store results in a Set to remove duplicates.
     * Convert the Set into a Stream for functional-style output.
     */
    public static void main(String[] args) {
        String str = "Anand";
        char[] chars = str.toCharArray();
        Arrays.sort(chars); // Sort to handle duplicates
        System.out.println(chars);
    }
}
