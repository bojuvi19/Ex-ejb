import Entity.Category;
import Entity.Profile;
import crud.CategoryService;
import crud.ProfileService;

import javax.ejb.Stateless;

/**
 * Created by Юля on 09.12.2015.
 */
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Stateless
public class Ejb_modBean {

    @PersistenceContext(name="ShopApp")
    EntityManager em;
    ProfileService service = new ProfileService();

        public Date get_time(){
            Date currentDate = new Date();
            return currentDate;    }

    public String AddUser(String l,String p, String e) {

        Profile user = new Profile();
        user.setLogin(l);
        user.setPassword(p);
        user.setPost(e);

        service.add(user,em);

        //Получаем обновленую запись
       // Profile user2 = service.get(14,em);
        String s=user.getLogin();
        return s;
    }
/*    public Profile getUser(){
        Profile user = new Profile();
        //Получаем обновленую запись
        user=service.get(14,em);
        return user;
    }*/

    public ArrayList FindUser()
    {
        return service.GetAll(em);
    }

}
