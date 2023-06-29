package streamMethods3;

import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

}

public class ParallelStreamsDemo {

    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                    new Student("David", 82),
                    new Student("Bob", 90),
                    new Student("Alex", 78),
                    new Student("John", 25),
                    new Student("Eric", 100),
                    new Student("Antony", 99),
                    new Student("Scott", 85)
        );

        //sequencial streams
        studentList.stream()
                .filter(student -> student.getScore() > 80)
                .limit(3)
                .forEach(stu -> System.out.println(stu.getName() + " " + stu.getScore() + " " ));

        //parallel streams
        studentList.parallelStream()
                .filter(student -> student.getScore() > 80)
                .limit(3)
                .forEach(stu -> System.out.println(stu.getName() + " " + stu.getScore() + " " ));

        //convert stream() --> parallelStream()


    }


}
