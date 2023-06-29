package flatmap.demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    String sname;
    int sid;
    char grade;

    public Student(String sname, int sid, char grade) {
        this.sname = sname;
        this.sid = sid;
        this.grade = grade;
    }
}

public class Demo3 {

    public static void main(String[] args) {

        List<Student> studentList1 = new ArrayList<Student>();
        studentList1.add(new Student("Smith", 101, 'A'));
        studentList1.add(new Student("Smithamson", 102, 'B'));
        studentList1.add(new Student("Smither", 103, 'C'));

        List<Student> studentList2 = new ArrayList<Student>();
        studentList1.add(new Student("Scott", 104, 'A'));
        studentList1.add(new Student("Scottamson", 105, 'B'));
        studentList1.add(new Student("Scotter", 106, 'C'));

        List<List<Student>> studentList = Arrays.asList(studentList2, studentList2);

        List<String> students =  studentList.stream()
                .flatMap(st -> st.stream())
                .map(s -> s.sname)
                .collect(Collectors.toList());

        System.out.println(students);

    }

}
