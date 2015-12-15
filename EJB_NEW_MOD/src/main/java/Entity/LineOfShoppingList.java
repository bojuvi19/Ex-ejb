package Entity;

import javax.persistence.*;

/**
 * Created by Юля on 11.12.2015.
 */
@Entity
@Table(name = "line_of_shoppinglist")
public class LineOfShoppingList {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idLine;

    @Column(name = "id_product")
    private int idProduct;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "summ")
    private long summ;

    @Column(name = "id_units")
    private long idUnits;

    @Column(name = "mark")
    private long mark;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="shoping_lits")
    private ShoppingList shoplist;

    @OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="trading_unit_id")
    private TradingUNIT tradingUNIT;

    @OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="units_id")
    private Units units;
}
