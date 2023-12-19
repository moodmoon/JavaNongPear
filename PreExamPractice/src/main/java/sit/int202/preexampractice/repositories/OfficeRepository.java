package sit.int202.preexampractice.repositories;

import jakarta.persistence.EntityManager;
import sit.int202.preexampractice.entities.Employee;
import sit.int202.preexampractice.entities.Office;

import java.util.Collections;
import java.util.List;

public class OfficeRepository {
    private EntityManager em;
    private EntityManager getEntityManager() {
        if (em == null || !em.isOpen()) {
            em = EntityManagerBuilder.getEntityManager();
        }
        return em;
    }

    public List<Office> findAll() {
        return Collections.emptyList();
    }

    public Office findById(String id) {
        return null;
    }

    public List<Employee> getEmployeeList(String officeId) {
        return Collections.emptyList();
    }
}
