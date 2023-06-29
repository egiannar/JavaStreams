package map.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class MapDemo4 {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(1, "John", 100000));
        employeeList.add(new Employee(2, "Maria", 20000));
        employeeList.add(new Employee(3, "May", 30000));
        employeeList.add(new Employee(4, "Kary", 400000));
        employeeList.add(new Employee(5, "Pete", 5000));

        //combination of filter and map
        //collection->stream->filter->map->collect
        List<Integer> employeeSalList =  employeeList.stream()
                .filter(e -> e.salary > 20000)
                .map(e -> e.salary)
                .collect(Collectors.toList());

        System.out.println(employeeSalList);

    }

}
