package sit.int202.preexampractice.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceException;
import sit.int202.preexampractice.entities.Employee;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class EmployeeRepository {
    private EntityManager em;

    public EntityManager getEntityManager() {
        if (em == null || !em.isOpen()) {
            em = EntityManagerBuilder.getEntityManager();
        }
        return em;
    }
    public List<Employee> findAll() {
        return Collections.emptyList();
    }
    public Employee findById(Integer employeeId) {
        return null;
    }

    public Optional<Employee> findByEmail(String email) {
        // Optional for null value
        return Optional.empty();
    }

    public void create(Employee employee) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(employee);
            em.getTransaction().commit();
        } catch (PersistenceException e) {
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public void delete(Employee employee) {
        if (employee.getId() == null) {
            throw new IllegalArgumentException("Deleted Employee must not have null id");
        }

        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(employee);
            em.getTransaction().commit();
        } catch (PersistenceException e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            em.close();
        }
    }
}
