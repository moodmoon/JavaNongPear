package sit.int202.simple;

import java.util.Date;

public class TestTime {


    public static void main(String[] args) {
        Date d1 = new Date(1000*60); // 1 min
        Date d2 = new Date(1000*60*60*24);// 1 day
        System.out.println(d1);
        System.out.println(System.currentTimeMillis());
        Date toDay = new Date(1693803828061L);
        Date tomorrow = new Date(1693803828061L+1000*60*60*24); // Today on 1 day
        System.out.println(toDay);
        System.out.println(tomorrow);
    }
}
