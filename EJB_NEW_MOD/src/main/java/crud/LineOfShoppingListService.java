package crud;

import Entity.LineOfShoppingList;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by Юля on 16.12.2015.
 */


public class LineOfShoppingListService {
    public EntityManager em = Persistence.createEntityManagerFactory("ShopApp").createEntityManager();

    public LineOfShoppingList add(LineOfShoppingList lineOfShoppingList){
        em.getTransaction().begin();
        LineOfShoppingList LineFromDB = em.merge(lineOfShoppingList);
        em.getTransaction().commit();
        return LineFromDB;
    }

    public void delete(long id){
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }

    public LineOfShoppingList get(long id){
        return em.find(LineOfShoppingList.class, id);
    }

    public void update(LineOfShoppingList lineOfShoppingList){
        em.getTransaction().begin();
        em.merge(lineOfShoppingList);
        em.getTransaction().commit();
    }
}
