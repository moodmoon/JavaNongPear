package sit.int202;

import java.util.Comparator;

// สร้าง class แยก แต่เราทำเป็น Anonymous Inner Class ไปแล้ว เลยไม่ใช้จ้า
public class StudentComparatorByGpax implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGpax() < o2.getGpax()) {
            return 1;
        } else if (o1.getGpax() > o2.getGpax()) {
            return -1;
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
