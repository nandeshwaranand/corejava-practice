package programs;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Java Program: Frequency Sort of Characters
 * This method sorts characters in a string by frequency (descending order) while maintaining
 * the first appearance order if frequencies are the same.
 */
public class FrequencySort {

    public static void main(String[] args) {
        String input = "tree";
        String result = frequencySort(input);
        System.out.println("output:" + result);
    }

    private static String frequencySort(String input) {
        if (input == null || input.isEmpty())
            return "";
        // Step 1: Count frequency of each character using LinkedHashMap (to maintain order)
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for (char ch : input.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        // Step 2: Sort characters by frequency (descending order), maintaining order of first appearance
        List<Character> sortedChars = new ArrayList<>(frequencyMap.keySet());
        sortedChars.sort((a, b) -> {
            int freqCompare = frequencyMap.get(b).compareTo(frequencyMap.get(a)); // Sort by frequency descending
            return (freqCompare != 0) ? freqCompare : 0; // Maintain insertion order if frequency is the same
        });

        // Step 3: Build result string
        StringBuilder result = new StringBuilder();
        for (char ch : sortedChars) {
            result.append(String.valueOf(ch).repeat(frequencyMap.get(ch))); // Append character based on frequency
        }
        return result.toString();
    }
}
