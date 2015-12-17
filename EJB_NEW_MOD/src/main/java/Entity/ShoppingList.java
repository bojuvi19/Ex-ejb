package Entity; /**
 * Created by Юля on 11.12.2015.
 */

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "shopping_list")
public class ShoppingList {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idList;


    @Column(name = "summ_of_list")
    private long summOfList;

    @Column(name = "date_of_list")
    @Temporal(TemporalType.DATE)
    private Date dateOfList;
    /*@OneToMany(mappedBy = "line_of_shoppinglist",fetch = FetchType.LAZY, cascade = CascadeType.ALL,orphanRemoval = true)
    private LineOfShoppingList idLine;*/

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="User_id")
    private Profile user;

    @OneToMany
    private List<LineOfShoppingList> lineOfShoppingLists=new ArrayList<LineOfShoppingList>();

    public long getIdList() {
        return idList;
    }

    public void setIdList(long idList) {
        this.idList = idList;
    }

    public long getSummOfList() {
        return summOfList;
    }

    public void setSummOfList(long summOfList) {
        this.summOfList = summOfList;
    }



    public Profile getUser() {
        return user;
    }

    public void setUser(Profile user) {
        this.user = user;
    }

    public List<LineOfShoppingList> getLineOfShoppingLists() {
        return lineOfShoppingLists;
    }

}
