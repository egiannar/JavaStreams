package streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2 {

    public static void main(String[] args) {
        //count
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        long count = numbersList
                        .stream()
                        .filter(n -> n % 2 == 0)
                        .count();
        System.out.println(count);

        //min()
        Optional<Integer> min = numbersList.stream()
                .min((val1, val2) -> {
                    return val1.compareTo(val2);
                });
        System.out.println(min.get());

        //max()
        Optional<Integer> max = numbersList.stream()
                .max((val1, val2) -> {
                    return val1.compareTo(val2);
                });
        System.out.println(max.get());
    }
}
