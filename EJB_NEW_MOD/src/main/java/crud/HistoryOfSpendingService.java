package crud;

/**
 * Created by Юля on 16.12.2015.
 */

import Entity.HistoryOfSpending;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class HistoryOfSpendingService {
    public EntityManager em = Persistence.createEntityManagerFactory("ShopApp").createEntityManager();

    public HistoryOfSpending add(HistoryOfSpending historyOfSpending){
        em.getTransaction().begin();
        HistoryOfSpending HistoryFromDB = em.merge(historyOfSpending);
        em.getTransaction().commit();
        return HistoryFromDB;
    }

    public void delete(long id){
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }

    public HistoryOfSpending get(long id){
        return em.find(HistoryOfSpending.class, id);
    }

    public void update(HistoryOfSpending historyOfSpending){
        em.getTransaction().begin();
        em.merge(historyOfSpending);
        em.getTransaction().commit();
    }
}
