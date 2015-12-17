package Entity; /**
 * Created by Юля on 11.12.2015.
 */
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long product;

    @Column(name = "unit_name", length = 32)
    private String productName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_category")
    private Category category;


    public long getproduct() {
        return product;
    }

    public void setproduct(long product) {
        this.product = product;
    }

    public String getproductName() {
        return productName;
    }

    public void setproductName(String productName) {
        this.productName = productName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


}
