package flatmap.demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

    public static void main(String[] args) {
        List<String> teamA = Arrays.asList("Scott", "David", "John");
        List<String> teamB = Arrays.asList("Mary", "Luna", "John");
        List<String> teamC = Arrays.asList("Luna", "David", "Mary");

        List<List<String>> playersInWorldCup = new ArrayList<List<String>>();
        playersInWorldCup.add(teamA);
        playersInWorldCup.add(teamB);
        playersInWorldCup.add(teamC);

        List<String> names = playersInWorldCup.stream()
                .flatMap(pList -> pList.stream())//create a stream for every object
                .collect(Collectors.toList());

        System.out.println(names);


    }

}
