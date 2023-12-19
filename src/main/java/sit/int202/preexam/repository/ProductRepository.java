package sit.int202.preexam.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import sit.int202.preexam.entities.Product;

import java.util.List;


public class ProductRepository {
    private EntityManager entityManager;

    private EntityManager getEntityManager() {
        if (entityManager == null || !entityManager.isOpen()) {
            entityManager = EntityManagerBuilder.getEntityManager();
        }
        return entityManager;
    }

    private static int PAGE_SIZE = 10;

    public int getDefaultPageSize() {
        return PAGE_SIZE;
    }

    public List<Product> findAll(int page, int pageSize) {
        int startPosition = (page - 1) * pageSize;
        EntityManager entityManager = getEntityManager();
        Query query = entityManager.createNamedQuery("PRODUCT.FIND_ALL");
        query.setFirstResult(startPosition);
        query.setMaxResults(pageSize);
        List<Product> productList = query.getResultList();
        entityManager.close();
        return productList;
    }

    public Product findProduct(String productCode) {
        return getEntityManager().find(Product.class, productCode);
    }

    public int countAll() {
        EntityManager entityManager = getEntityManager();
        int number = ((Number) entityManager.createNamedQuery("PRODUCT.COUNT").getSingleResult()).intValue();
        entityManager.close();
        return number;
    }

    public void close() {
        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
        }
    }
}
