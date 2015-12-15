package Entity; /**
 * Created by Юля on 11.12.2015.
 */
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "trading_unit")
public class TradingUNIT {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idUNIT;

    @Column(name = "unit_name", length = 32)
    private String unitName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_category")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="regularBuy_id")
    private RegularBuy regularBuy;

    @OneToMany(mappedBy="id_line")
    private List<LineOfShoppingList> lines=new ArrayList<LineOfShoppingList>();

    public long getIdUNIT() {
        return idUNIT;
    }

    public void setIdUNIT(long idUNIT) {
        this.idUNIT = idUNIT;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public RegularBuy getRegularBuy() {
        return regularBuy;
    }

    public void setRegularBuy(RegularBuy regularBuy) {
        this.regularBuy = regularBuy;
    }

    public List<LineOfShoppingList> getLines() {
        return lines;
    }

}
