package sit.int202;

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Student s1 = new Student(10001,"Somsri",3.25);
        Student s2 = new Student(10002,"Somsak",3.00);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));

        // When we have 100 students
        Set<Student> studentSet = new HashSet<>(10, 0.5f);
        // Set<Student> studentSet = new HashSet<>(200, 0.5f);
        studentSet.add(new Student(10001,"Somsri",3.25));
        studentSet.add(new Student(10002,"Somsak",3.00));
        studentSet.add(new Student(10009,"Somchai",3.26));
        studentSet.add(new Student(10007,"Somsiri",3.25));
        studentSet.add(new Student(10055,"Sirisopaphan",3.25));
        for (Student s: studentSet) {
            System.out.println(s);
        }

        Set<Student> studentSet2 = new TreeSet<>();
        studentSet2.add(new Student(10001,"Somsri",3.25));
        studentSet2.add(new Student(10002,"Somsak",3.00));
        studentSet2.add(new Student(10009,"Somchai",3.26));
        studentSet2.add(new Student(10007,"Somsiri",3.25));
        studentSet2.add(new Student(10037," Sirisopaphan",3.25));

        System.out.println("-------------");
        List<Student> tmp = studentSet2.stream().sorted(Student.COMPARE_BY_GPAX).toList();
        for (Student s : tmp) {
            System.out.println(s);
        }

    }
}

