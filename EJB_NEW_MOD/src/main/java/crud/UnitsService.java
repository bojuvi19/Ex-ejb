package crud;

import Entity.Units;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by Юля on 16.12.2015.
 */
public class UnitsService {
    public EntityManager em = Persistence.createEntityManagerFactory("ShopApp").createEntityManager();

    public Units add(Units units){
        em.getTransaction().begin();
        Units unitsFromDB = em.merge(units);
        em.getTransaction().commit();
        return unitsFromDB;
    }

    public void delete(long id){
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }

    public Units get(long id){
        return em.find(Units.class, id);
    }

    public void update(Units units){
        em.getTransaction().begin();
        em.merge(units);
        em.getTransaction().commit();
    }
}
