package Entity;

import javax.persistence.*;

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

    @Column(name = "id_profile")
    private int idProfile;

    @Column(name = "id_list")
    private long idList;




}
