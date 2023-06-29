package map.demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

    public static void main(String[] args) {

        //source collection
        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");

        //target collection
        List<String> uppercaseVehicles = new ArrayList<String>();

        vehicles.stream()
                .map(v -> v.toUpperCase())
                .forEach(System.out::println);

        System.out.println("With target collection");
        uppercaseVehicles = vehicles
                            .stream()
                            .map(v -> v.toUpperCase())
                            .collect(Collectors.toList());

        System.out.println(uppercaseVehicles);

    }

}
