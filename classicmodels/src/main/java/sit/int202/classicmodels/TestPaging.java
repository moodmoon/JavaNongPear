package sit.int202.classicmodels;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import sit.int202.classicmodels.entities.Employee;

import java.util.List;
import java.util.Scanner;

public class TestPaging {
    public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager em = emf.createEntityManager();
    Query query = em.createNamedQuery("EMPLOYEE.FIND_ALL");
    int start = 0;
    int pageSize = 5;
    query.setMaxResults(pageSize);
    while (true)    {
        query.setFirstResult(start);
        List<Employee> employees = query.getResultList();
        if (employees.isEmpty()){
            break;
        }
            start = start + pageSize;
            displayEmployees(employees);
            System.out.println("Press x then ENTER to view next page... ");
            new Scanner(System.in).nextLine();
        }
    em.close();
    }
    private static void displayEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.printf("%4d %-10s %-15s %-20s\n",
                    employee.getId() , employee.getFirstName() ,
                    employee.getLastName() , employee.getJobTitle());
        }
        System.out.println("--------------------------");
    }
}
