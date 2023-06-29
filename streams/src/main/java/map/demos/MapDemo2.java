package map.demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {

    public static void main(String[] args) {

        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");

        List<Integer> vehiclesLength = new ArrayList<Integer>();

        vehicles.stream()
                .map(str -> str.length())
                .forEach(System.out::println);


    }

}
