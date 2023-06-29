package filter.demos;

import java.util.*;

public class FilterDemo3 {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("cup", null, "forest", "sky", "book", null, "theater");

        words.stream()
                .filter(str -> str!=null)
                .forEach(System.out::println);

    }

}
