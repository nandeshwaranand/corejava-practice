package test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * I/P : 1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10
 *
 * O/P : 1,3,5,7,9 -> 1,5,9 ->5
 * find and remove the adjacent till the last digit remains
 */
public class RemoveAdjacents {

    public static void main(String[] args) {
        int [] nums= {1,2,3,4,5,6,7,8,9,10, 1,2,3,4,5,6,7,8,9,10};
        List<Integer> numbers =  Arrays.stream(nums).boxed().toList();
        System.out.println(numbers);
        while (numbers.size() > 1) {
            List<Integer> tempList = new ArrayList<>();
            for (int i = 0; i < numbers.size();  i += 2) {
                tempList.add(numbers.get(i));
                System.out.print("index:"+i+" ");
            }

            // Remove duplicates while preserving order
            Set<Integer> uniqueNumbers = new LinkedHashSet<>(tempList);
            numbers = new ArrayList<>(uniqueNumbers);
            System.out.println("Iteration:"+numbers);
        }
        System.out.println(numbers);
    }
}
