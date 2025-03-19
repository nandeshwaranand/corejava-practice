package java8.enhancement;

import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Anand","Joy","Martin","Glenn");
        list.forEach(name -> System.out.println(name));
    }
}
