package Entity; /**
 * Created by Юля on 11.12.2015.
 */
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "regular_buy")
public class RegularBuy {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idBuy;

    @Column(name = "id_product")
    private List<TradingUNIT> products=new ArrayList<TradingUNIT>();

    @Column(name = "time_period")
    @Temporal(TemporalType.DATE)
    private Date timePeriod;

    @Column(name = "time_deposits")
    @Temporal(TemporalType.DATE)
    private Date time_deposits;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="User_id")
    private Profile user;

    public long getIdBuy() {
        return idBuy;
    }

    public void setIdBuy(long idBuy) {
        this.idBuy = idBuy;
    }

    public List<TradingUNIT> getProducts() {
        return products;
    }



    public Date getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(Date timePeriod) {
        this.timePeriod = timePeriod;
    }

    public Date getTime_deposits() {
        return time_deposits;
    }

    public void setTime_deposits(Date time_deposits) {
        this.time_deposits = time_deposits;
    }

    public Profile getUser() {
        return user;
    }

    public void setUser(Profile user) {
        this.user = user;
    }
}
