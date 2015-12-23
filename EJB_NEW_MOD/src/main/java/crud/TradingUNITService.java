package crud;

import Entity.Product;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by Юля on 16.12.2015.
 */
public class TradingUNITService {
    public EntityManager em = Persistence.createEntityManagerFactory("ShopApp").createEntityManager();

    public Product add(Product product){
        em.getTransaction().begin();
        Product productFromDB = em.merge(product);
        em.getTransaction().commit();
        return productFromDB;
    }

    public void delete(long id){
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }

    public Product get(long id){
        return em.find(Product.class, id);
    }

    public void update(Product product){
        em.getTransaction().begin();
        em.merge(product);
        em.getTransaction().commit();
    }
}
