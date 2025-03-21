package programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicates {

    public static void main(String[] args) {
        String [] names = {"anand","anand","hello", "bob","joy","bob"};

        Set<String> duplicates = new HashSet<>();
        HashSet<String> seen = new HashSet<>();
        for (String name: names){
           if (!seen.add(name)){
               duplicates.add(name);
           }
        }
        System.out.println("Set Duplicate elements: " + duplicates);
        usingMap(names);
        withoutCollection(names);
    }

    static void usingMap(String[] names){
        Map<String, Integer> duplicates = new HashMap<>();
        for (String name : names){
            int count = 0;
            for(int i =0; i< names.length; i++) {
                if (name.equals(names[i])) {
                    count++;
                }
                if (count > 1) {
                    duplicates.put(name, count);
                }
            }
        }
        System.out.println("Map Duplicate elements: " + duplicates);
    }

    static void withoutCollection(String[] names){
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) continue; // Skip already checked elements we marked checked element as null
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println(names[i]);
                    names[j] = null; // Mark as checked to avoid duplicate printing
                    break;
                }
            }
        }
    }
}
