package filter.demos;

import java.util.*;
import java.util.stream.Collectors;

public class FilterDemo1 {

    public static void main(String[] args) {

      /*  ArrayList<Integer> numbersList = new ArrayList<Integer>();

        numbersList.add(10);
        numbersList.add(15);
        numbersList.add(20);
        numbersList.add(25);
        numbersList.add(30);*/

        List<Integer> numbersList = Arrays.asList(10, 15, 20, 25, 30);

        List<Integer> evenNumbersList = new ArrayList<Integer>();

        //without streams
        /*for(int n:numbersList) {
            if (n%2==0)
                evenNumbersList.add(n);
        }
        System.out.println(evenNumbersList);*/


        //using streams
        //we add the numbersList to the stream
        evenNumbersList = numbersList.stream()
                //inside the filter we add the condition
                //it is applied to all the elements. With filter method we process the data
                .filter(n -> n%2==0)
                .collect(Collectors.toList());
        System.out.println(evenNumbersList);

        numbersList.stream().filter(n -> n%2==0).forEach(n-> System.out.println(n));

        numbersList.stream().filter(n -> n%2==0).forEach(System.out::println);


    }
}