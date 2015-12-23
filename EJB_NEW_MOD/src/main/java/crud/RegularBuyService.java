package crud;

import Entity.RegularBuy;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by Юля on 16.12.2015.
 */
public class RegularBuyService {
    public EntityManager em = Persistence.createEntityManagerFactory("ShopApp").createEntityManager();

    public RegularBuy add(RegularBuy regularBuy){
        em.getTransaction().begin();
        RegularBuy regularBuyFromDB = em.merge(regularBuy);
        em.getTransaction().commit();
        return regularBuyFromDB;
    }

    public void delete(long id){
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }

    public RegularBuy get(long id){
        return em.find(RegularBuy.class, id);
    }

    public void update(RegularBuy regularBuy){
        em.getTransaction().begin();
        em.merge(regularBuy);
        em.getTransaction().commit();
    }
}
