package Entity; /**
 * Created by Юля on 11.12.2015.
 */
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "regular_buy")
public class RegularBuy {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idBuy;

    @Column(name = "id_product")
    private int idProduct;

    @Column(name = "id_profile")
    private int idProfile;

    @Column(name = "time_period")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timePeriod;

    @Column(name = "time_deposits")
    @Temporal(TemporalType.TIMESTAMP)
    private Date time_deposits;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="User_id")
    private Profile user;

}
