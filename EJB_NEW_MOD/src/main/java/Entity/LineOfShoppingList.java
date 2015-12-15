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

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "summ")
    private long summ;

    @Column(name = "mark")
    @Enumerated(EnumType.STRING)
    private EnumMarkOfList mark;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="shoping_lits")
    private ShoppingList shoplist;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="trading_unit_id")
    private TradingUNIT tradingUNIT;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="units_id")
    private Units units;

    public long getIdLine() {
        return idLine;
    }

    public void setIdLine(long idLine) {
        this.idLine = idLine;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public long getSumm() {
        return summ;
    }

    public void setSumm(long summ) {
        this.summ = summ;
    }

    public EnumMarkOfList getMark() {
        return mark;
    }

    public void setMark(EnumMarkOfList mark) {
        this.mark = mark;
    }

    public ShoppingList getShoplist() {
        return shoplist;
    }

    public void setShoplist(ShoppingList shoplist) {
        this.shoplist = shoplist;
    }

    public TradingUNIT getTradingUNIT() {
        return tradingUNIT;
    }

    public void setTradingUNIT(TradingUNIT tradingUNIT) {
        this.tradingUNIT = tradingUNIT;
    }

    public Units getUnits() {
        return units;
    }

    public void setUnits(Units units) {
        this.units = units;
    }
}
