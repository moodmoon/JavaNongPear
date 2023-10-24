package sit.int202.classicmodels;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import sit.int202.classicmodels.entities.Office;

public class TestJpa {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        System.out.println(emf);
        EntityManager em = emf.createEntityManager();
        //System.out.println(em);
        Office office = em.find(Office.class, "5");
        if (office != null){
            System.out.printf("%s %s %s\n", office.getCity(),
                    office.getCountry() , office.getPostalCode());
        } else {
            System.out.println("Office code does not exist !!!");
        }

        Office newOffice = new Office();
        newOffice.setOfficeCode("9");
        newOffice.setAddressLine1(office.getAddressLine1());
        newOffice.setAddressLine2(office.getAddressLine2());
        newOffice.setCity(("Bangmod"));
        newOffice.setCountry(("Thailand"));
        newOffice.setPhone(office.getPhone());
        newOffice.setPostalCode(office.getPostalCode());
        newOffice.setState(office.getState());
        newOffice.setTerritory(office.getTerritory());

        em.getTransaction().begin();
        em.persist(newOffice);
        em.getTransaction().commit();
        em.close();
    }
}
