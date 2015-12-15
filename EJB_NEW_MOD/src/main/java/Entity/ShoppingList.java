package Entity; /**
 * Created by Юля on 11.12.2015.
 */

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shopping_list")
public class ShoppingList {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idList;


    @Column(name = "summ_of_list")
    private long summOfList;

    @OneToMany(mappedBy = "line_of_shoppinglist",fetch = FetchType.LAZY, cascade = CascadeType.ALL,orphanRemoval = true)
    private LineOfShoppingList idLine;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="User_id")
    private Profile user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="User_spending")
    private MonthlySpending spending;

    @OneToMany(mappedBy="shoplist")
    private List<LineOfShoppingList> lineOfShoppingLists=new ArrayList<LineOfShoppingList>();
}
