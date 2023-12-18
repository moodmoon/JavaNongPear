package sit.int202.classicmodels.repositories;

import sit.int202.classicmodels.entities.Office;
import sit.int202.classicmodels.entities.Product;
import jakarta.persistence.*;

import java.util.List;

public class ProductRepository {
    private static int PAGE_SIZE = 10;
    public int getDefaultPageSize() {
        return PAGE_SIZE;
    }

    private EntityManager entityManager;

    private EntityManager getEntityManager() {
        if (entityManager == null || !entityManager.isOpen()) {
            entityManager = EntityManagerBuilder.getEntityManager();
        }
        return entityManager;
    }
    public List<Product> findAll(int page, int pageSize) { // ส่ง find all มาเหมือนกัน
        int startPosition = (page-1) * pageSize;
        EntityManager entityManager = getEntityManager();
        Query query = entityManager.createNamedQuery("PRODUCT.FIND_ALL");
        query.setFirstResult(startPosition);
        query.setMaxResults(pageSize);
        List<Product> productList = query.getResultList();
        return productList;
    }
    public int countAll() { // นับจำนวน record
        EntityManager entityManager = getEntityManager();
        int number = ((Number) entityManager.createNamedQuery("PRODUCT.COUNT").getSingleResult()).intValue();
        return number;
    }
    public void close() {
        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
        }
    }
    public Product findProduct(String productCode) { //
        return getEntityManager().find(Product.class, productCode);
    }
}
