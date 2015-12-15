package Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Юля on 14.12.2015.
 */
@Entity
@Table(name = "category")
public class Category {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCategory;

    @Column(name = "name_category", length = 32)
    private String nameCategory;

    @OneToMany(mappedBy="category")
    private List<TradingUNIT> tradingUNITs=new ArrayList<TradingUNIT>();
}
