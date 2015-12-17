import Entity.Category;
import crud.CategoryService;

import javax.ejb.Stateless;

/**
 * Created by Юля on 09.12.2015.
 */
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;

@Stateless
public class Ejb_modBean {

    @PersistenceContext(name="ShopApp")
    EntityManager em;
    CategoryService service = new CategoryService();

        public Date get_time(){
            Date currentDate = new Date();
            return currentDate;    }
    public void DB() {

        Category category1 = new Category();
        category1.setNameCategory("eat");

        service.add(category1,em);


    }

}
