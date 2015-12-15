package Entity; /**
 * Created by Юля on 11.12.2015.
 */

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "month_spending")
public class HistoryOfSpending {

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

    public Date getDateOfSpending() {
        return dateOfSpending;
    }

    public void setDateOfSpending(Date dateOfSpending) {
        this.dateOfSpending = dateOfSpending;
    }

    public long getSummOfSpending() {
        return summOfSpending;
    }

    public void setSummOfSpending(long summOfSpending) {
        this.summOfSpending = summOfSpending;
    }

    public Profile getUser() {
        return user;
    }

    public void setUser(Profile user) {
        this.user = user;
    }

    public List<ShoppingList> getShoppingLists() {
        return shoppingLists;
    }

}
