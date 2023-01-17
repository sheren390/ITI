package gov.iti.jets;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyProjectJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Account c = entityManager.find(Account.class, 2);
        Account c2 = new Account();
        c2.setUsername("Haidi");
        c2.setFullName("Haidi hany");
        c2.setPassword("mypass22");
        entityManager.getTransaction().begin();
        entityManager.persist(c2);
        entityManager.getTransaction().commit();

    }
}
