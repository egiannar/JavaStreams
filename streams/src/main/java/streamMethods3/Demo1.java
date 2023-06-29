package streamMethods3;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<String>();

        fruits.add("One Apple");
        fruits.add("One Mango");
        fruits.add("Two Apple");
        fruits.add("Two Mangoes");

        //Any Match
        boolean match = fruits.stream().anyMatch(value -> {
            return value.startsWith("one");
        });
        System.out.println(match);

        //allMatch()
        boolean allMatch =fruits.stream().allMatch(value -> {
         return value.startsWith("One");
        });
        System.out.println(allMatch);




    }

}
