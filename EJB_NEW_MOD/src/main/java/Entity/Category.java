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
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCategory;

    @Column(name = "name_category", length = 32)
    private String nameCategory;

    public long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(long idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }



}
