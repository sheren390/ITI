package gov.iti.jets;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mypersistenec");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Student student1 = new Student("Shereen", "Gamil", "Biomedical") ;
        Student student2 = new Student("Mariam", "Hesham", "CS") ;
        entityManager.persist(student1);
        entityManager.persist(student2);
        Teacher teacher1 = new Teacher("Tamer", "Basha",new Date());
        entityManager.persist(teacher1);

        entityManager.getTransaction().commit();
    }
}
