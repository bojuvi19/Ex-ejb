package Entity; /**
 * Created by Юля on 11.12.2015.
 */

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "month_spending")
public class MonthlySpending {

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfSpending;

    @Column(name = "summ_of_spending ")
    private long summOfSpending;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="User_id")
    private Profile user;

    @OneToMany(mappedBy="spending")
    private List<ShoppingList> shoppingLists=new ArrayList<ShoppingList>();

}
