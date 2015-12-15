package Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Юля on 14.12.2015.
 */

@Entity
@Table(name = "units")
public class Units {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idUnits;

    @Column(name = "name_unit", length = 32)
    private String nameUnit;

    @Column(name = "abbreviation", length = 32)
    private String abbreviation;

    @OneToMany(mappedBy="id_line")
    private List<LineOfShoppingList> lines=new ArrayList<LineOfShoppingList>();


    public long getIdUnits() {
        return idUnits;
    }

    public void setIdUnits(long idUnits) {
        this.idUnits = idUnits;
    }

    public String getNameUnit() {
        return nameUnit;
    }

    public void setNameUnit(String nameUnit) {
        this.nameUnit = nameUnit;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public List<LineOfShoppingList> getLines() {
        return lines;
    }

}
