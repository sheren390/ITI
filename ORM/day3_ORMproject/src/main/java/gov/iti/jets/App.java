package gov.iti.jets;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * Hello world!
 *
 */
public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mypersistenec");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        // Create & Store USer Entity
        User user = new User("sherengamil390@gmail.com", "shobra masr", new Date(), "Shereen", "Shereen1234");
        User user2 = new User("MAriamhesham@gmail.com", "Helwan", new Date(), "Mariam", "mariam1234");
        User user3 = new User("Haidyhany@gmail.com", "October", new Date(), "Haidi", "haidi3334");
        
        user.setMobile("01061401111");
        entityManager.persist(user);
        user2.setMobile("01061404444");
        entityManager.persist(user2);
        user3.setMobile("01161405656");
        entityManager.persist(user3);

        // Create & Store Buyer Entity
        Buyer buyer1 = new Buyer(user, "i'm buyer Mariam");
        entityManager.persist(buyer1);
        Buyer buyer2 = new Buyer(user3, "i'm buyer 2 salma");
        entityManager.persist(buyer2);

        // Create & Store Seller Entity
        Seller seller1 = new Seller(user2, "i'm seller reem");
        entityManager.persist(seller1);
        Seller seller2= new Seller(user, "i'm seller Shereen");
        entityManager.persist(seller2);

        // Create & Store Category Entity
        Category category = new Category("my category");
        category.setDescription("it is the best category");
        entityManager.persist(category);

        // Create & Store product Entity
        Product product1 = new Product("Chipsy", "boteto", new Date(), 99, new Date(), new Date());
        product1.setSeller(seller1);
        product1.setDescription("product is out of stock");
        product1.setExpirationDate(new Date());

        Product product2 = new Product("Chipsy", "Chipsy", new Date(), 100, new Date(), new Date());
        Product product3 = new Product("fish", "fishecoo", new Date(), 150, new Date(), new Date());
        Product product4 = new Product("water", "life", new Date(), 99, new Date(), new Date());
        Product product5 = new Product("candy", "babyloly", new Date(), 120, new Date(), new Date());
        Set <Product> products = new HashSet<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        entityManager.persist(product2);
        entityManager.persist(product3);
        entityManager.persist(product4);
        entityManager.persist(product5);

        category.setProducts(products);


        // product1.setCategories(category2);
        entityManager.persist(product1);

        // Create BuyerBidProductId Entity
        BuyerBidProductId bbidpID = new BuyerBidProductId(buyer1.getId(), product1.getId());

        // Create & Store BuyerBidProduct Entity
        BuyerBidProduct buyerbidproduct = new BuyerBidProduct(bbidpID, buyer1, product1, new Date(), 5,
                product1.getQuantity());
        entityManager.persist(buyerbidproduct);

        // Create BuyerBuyProductId Entity
        BuyerBuyProductId bbuypId = new BuyerBuyProductId(buyer1.getId(), product1.getId());

        // Create & Store BuyerBuyProduct Entity
        BuyerBuyProduct buyerbuyProduct = new BuyerBuyProduct(bbuypId, buyer1, product1, new Date(), 10,
                product1.getQuantity());
        entityManager.persist(buyerbuyProduct);

        Query q = entityManager.createQuery("select P from Product P")

        entityManager.getTransaction().commit();
    }
}
