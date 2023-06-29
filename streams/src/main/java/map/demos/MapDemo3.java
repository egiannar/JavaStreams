package map.demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {

    public static void main(String[] args) {

        List<Integer> numbersList = Arrays.asList(2,3,4,5);

        List<Integer> multipliedList = new ArrayList<>();

        multipliedList = numbersList
                .stream()
                .map(num -> num * 3)
                .collect(Collectors.toList());

        System.out.println(multipliedList);

        System.out.println("-----------------------");

        numbersList
                .stream()
                .map(num -> num * 3)
                .forEach(System.out::println);

    }

}
