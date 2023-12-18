package sit.int202.classicmodels;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import sit.int202.classicmodels.entities.Employee;
import sit.int202.classicmodels.entities.Environment;
import sit.int202.classicmodels.entities.Office;

public class TestJpa2 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(Environment.UNIT_NAME);
        EntityManager em = emf.createEntityManager();
        Office office = em.find(Office.class, "8");
        Employee emp = em.find(Employee.class, "1002");
        if (! emp.getFirstName().equalsIgnoreCase("somchai")){
            em.getTransaction().begin();
            emp.setFirstName("Somchai");
            em.persist(emp);
            em.getTransaction().commit();
        }
        System.out.println(emp);

        if (office != null){
            System.out.printf("%s %s %s\n", office.getCity(),
                    office.getCountry() , office.getPostalCode());
        } else {
            System.out.println("Office code does not exist !!!");
        }


    }
}
