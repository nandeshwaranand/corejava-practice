package streames;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


/**
 * Que: How will you simulate concurrent modification through stream API ?
 */
public class StreamConcurrentModification {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Anand", "Deepak", "John", "Ron");
        // This is the stream processing while trying to modify the list during the stream operation
        try {
            nameList.stream().forEach(name -> {
                if (name.equals("John")) {
                    nameList.remove(name);  // Concurrent modification
                }
            });
        } catch (Exception e) {
            System.out.println("Caught ConcurrentModificationException: " + e.getMessage());
            resolveConcurrentModificationProblem();
        }
    }

    /**
     * Using thread-safe collections or synchronize modifications to avoid such exceptions.
     * One way to safely simulate concurrent modification with streams is to use a CopyOnWriteArrayList,
     * which allows safe concurrent modification while iterating.
     */
    public static void resolveConcurrentModificationProblem(){
        List<String> nameList = new CopyOnWriteArrayList<>(Arrays.asList("Anand", "Deepak", "John", "Ron"));
        nameList.stream().forEach(name -> {
            if (name.equals("John")) {
                nameList.remove(name);  // Concurrent modification
            }
        });
        System.out.println(nameList);
    }
}
