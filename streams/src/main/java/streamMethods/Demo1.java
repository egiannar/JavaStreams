package streamMethods;

//distinct - limit
//count

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

    public static void main(String[] args) {
        //remove duplicates == distinct

        List<String> vehicleList = Arrays.asList("bus", "car", "bicycle", "bus", "car", "train", "bike");

        vehicleList.stream().distinct().forEach(System.out::println);

        //count
        long count = vehicleList.stream().distinct().count();
        System.out.println(count);

        //limit
        List<String> limitVehicle = vehicleList.stream().limit(3).collect(Collectors.toList());
        System.out.println(limitVehicle);
    }

}
