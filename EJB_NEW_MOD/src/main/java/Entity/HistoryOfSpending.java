package Entity; /**
 * Created by Юля on 11.12.2015.
 */

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "histort_of_spending")
public class HistoryOfSpending {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idHistory;

    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date dateOfSpending;

    @Column(name = "summ_of_spending ")
    private long summOfSpending;

    @OneToMany
    private List<Profile> user =new ArrayList<Profile>();

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

}
