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
    @JoinColumn(name="product_id")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="unit_id")
    private Units unit;

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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
