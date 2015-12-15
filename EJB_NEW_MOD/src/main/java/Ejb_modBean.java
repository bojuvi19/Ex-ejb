import javax.ejb.Stateless;

/**
 * Created by Юля on 09.12.2015.
 */
import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.util.Date;

@Stateless
public class Ejb_modBean {

        public Date get_time(){
            Date currentDate = new Date();
            return currentDate;    }

}
