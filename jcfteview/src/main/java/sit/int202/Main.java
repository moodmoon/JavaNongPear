package sit.int202;

public class Main {
    public static void main(String[] args) {
//        System.out.printf("Hello and welcome!");
        Student student = new Student(10001,"Somsri",3.25);
        Student student2 = new Student(10002,"Somsak",3.00);
        Student student3 = new Student(10003,"Somchai",3.26);
        System.out.println(student.getName());
        System.out.println(student);
    }
}