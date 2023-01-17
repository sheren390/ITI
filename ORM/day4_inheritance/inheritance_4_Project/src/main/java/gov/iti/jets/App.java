package gov.iti.jets;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mypersistenec");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Student student1 = new Student("Biomedical");
        student1.setFirstName("Sherin");
        student1.setLastName("Gamil");
        Student student2 = new Student("CS");
        student2.setFirstName("Mostafa");
        student2.setLastName("Mahmoud");
        entityManager.persist(student1);
        entityManager.persist(student2);
        Teacher teacher1 = new Teacher(new Date());
        teacher1.setFirstName("Mohsen");
        teacher1.setLastName("Diab");
        entityManager.persist(teacher1);

        entityManager.getTransaction().commit();

    }
}
