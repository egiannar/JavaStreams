package streamMethods3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo4 {

    public static void main(String[] args) {
        List<String> animalsList = Arrays.asList("Dog", "Cat", "Elephant");
        List<String> birdsList = Arrays.asList("peackock", "parrot", "crow");

        Stream<String> stream1 = animalsList.stream();
        Stream<String> stream2 = birdsList.stream();

        List<String> collect = Stream.concat(stream1, stream2).collect(Collectors.toList());
        System.out.println(collect);
    }

}
