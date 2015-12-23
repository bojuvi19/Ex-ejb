package crud;

import Entity.ShoppingList;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by Юля on 16.12.2015.
 */
public class ShoppingListService {
    public EntityManager em = Persistence.createEntityManagerFactory("ShopApp").createEntityManager();

    public ShoppingList add(ShoppingList shoppingList){
        em.getTransaction().begin();
        ShoppingList shoppingListFromDB = em.merge(shoppingList);
        em.getTransaction().commit();
        return shoppingListFromDB;
    }

    public void delete(long id){
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }

    public ShoppingList get(long id){
        return em.find(ShoppingList.class, id);
    }

    public void update(ShoppingList shoppingList){
        em.getTransaction().begin();
        em.merge(shoppingList);
        em.getTransaction().commit();
    }
}
