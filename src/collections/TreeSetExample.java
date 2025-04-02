package collections;

import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

/**
 * TreeSet is used to store elements in a sorted and unique manner. It implements the SortedSet and NavigableSet interfaces,
 * which provide additional functionalities such as accessing elements in ascending or descending order.
 * Not Thread-Safe
 * Internally, TreeSet is implemented using a TreeMap (a Red-Black Tree).
 * The Red-Black Tree ensures:
 * O(log n) time complexity for insertion, deletion, and search.
 * Automatic ordering of elements.
 */
public class TreeSetExample {

    static Logger logger = Logger.getLogger(TreeSetExample.class.getName());

    public static void main(String[] args) {
        TreeSet<String> names = stringTreeSet();
        names.forEach(System.out::println);

        logger.info("First Element: "+names.first());
        System.out.println("Last Element: "+names.last());
        System.out.println("Descending Order: "+names.descendingSet());

        TreeSet<Integer> numbers = numberTreeSet();
        System.out.println("lower :"+numbers.lower(15));  // 10  (Just smaller than 15)
        System.out.println("higher :"+numbers.higher(15)); // 20  (Just greater than 15)
        System.out.println("floor :"+numbers.floor(15));  // 15  (<= 15)
        System.out.println("ceiling :"+numbers.ceiling(16)); // 20 (>= 16)
    }

    static TreeSet<Integer> numberTreeSet() {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(10);
        return numbers;
    }

    static TreeSet<String> stringTreeSet() {
        TreeSet<String> names = new TreeSet<>();
        names.add("Anand");
        names.add("Joy");
        names.add("Deep");
        names.add("Iman");
        names.add("Bob");
        return names;
    }
}
