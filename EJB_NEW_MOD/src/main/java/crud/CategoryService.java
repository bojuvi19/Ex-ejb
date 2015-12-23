package crud;

/**
 * Created by Юля on 16.12.2015.
 */
import Entity.Category;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;
public class CategoryService {



    public void add(Category category,EntityManager em){
       // em.getTransaction().begin();
       em.merge(category);
        //em.getTransaction().commit();
        //return userFromDB;
    }
/*
    public void delete(long id){
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }

    public Category get(long id){
        return em.find(Category.class, id);
    }

    public void update(Category category){
        em.getTransaction().begin();
        em.merge(category);
        em.getTransaction().commit();
    }*/
}
