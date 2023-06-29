package streamMethods2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//sorted
public class Demo1 {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(2,4,3,7,5,8,4,1);

        List<Integer> sorted = list1.stream()
                .sorted()//ascending
                .collect(Collectors.toList());
        System.out.println(sorted);

        List<Integer> sorted1 = list1.stream()
                .sorted(Comparator.reverseOrder())//ascending
                .collect(Collectors.toList());
        System.out.println(sorted1);

        //Strings
        List<String> list2 = Arrays.asList("John", "Mary", "Kim", "Smith");
        List<String> sortedList2 = list2.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedList2);
    }

}
