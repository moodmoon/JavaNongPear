package sit.int202.preexampractice;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import jakarta.persistence.EntityManager;
import sit.int202.preexampractice.entities.Employee;
import sit.int202.preexampractice.repositories.EmployeeRepository;

public class TestQuery {
//    public static void main(String[] args) {
//        assignPassword();
//    }
    public static void main(String[] args) {
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2d, 16, 16);
        EmployeeRepository employeeRepository = new EmployeeRepository();
        EntityManager em = employeeRepository.getEntityManager();
        em.getTransaction().begin();
        char[] password;

        for (Employee employee : employeeRepository.findAll()) {
            password = employee.getId().toString().toCharArray();
            employee.setPassword(argon2.hash(2,16,1,password));
        }

        em.getTransaction().commit();
    }
}


