package crud;

import Entity.Profile;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.servlet.ServletException;
import javax.swing.text.AbstractDocument;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Юля on 16.12.2015.
 */
public class ProfileService {

    //public EntityManager em = Persistence.createEntityManagerFactory("ShopApp").createEntityManager();

    public void add(Profile user, EntityManager em) {
        /*em.getTransaction().begin();*/
        em.merge(user);
        /*em.getTransaction().commit();*/
    }

   /* public void delete(long id){
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }*/

    public Profile get(long id, EntityManager em) {
        return em.find(Profile.class, id);
    }

    /* public void update(Profile user){
         em.getTransaction().begin();
         em.merge(user);
         em.getTransaction().commit();
     }*/
    public List<UserRow> GetAll(EntityManager em) {


        List<UserRow> ret=new ArrayList<UserRow>();
        TypedQuery<UserRow> query = em.createQuery("select new crud.UserRow(login,post) from Profile", UserRow.class);
        List<UserRow> list = query.getResultList();

        for (UserRow userRow : list) {
            ret.add(userRow);
        }

/*        CriteriaQuery<Profile> q = em.createQuery(Profile.class);
        Root<Profile> account = q.from(Profile.class);
        q.select(account);
        List<Profile> accounts = em.createQuery(q).getResultList();*/
        return ret;
    }

}
