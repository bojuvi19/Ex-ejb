package Entity; /**
 * Created by Юля on 11.12.2015.
 */

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Profile {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idProfile;

    @Column(name = "login", length = 32)
    private String login;

    @Column(name = "password", length = 32)
    private String password;

    @Column(name = "post", length = 32)
    private String post;

    @OneToMany(mappedBy="user")
    private List<ShoppingList> shoppingLists=new ArrayList<ShoppingList>();

    @OneToMany(mappedBy="user")
    private List<HistoryOfSpending> historyOfSpendings =new ArrayList<HistoryOfSpending>();

    @OneToMany(mappedBy="user")
    private List<RegularBuy> regularBuys=new ArrayList<RegularBuy>();

    public long getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(long idProfile) {
        this.idProfile = idProfile;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public List<ShoppingList> getShoppingLists() {
        return shoppingLists;
    }



    public List<HistoryOfSpending> getHistoryOfSpendings() {
        return historyOfSpendings;
    }



    public List<RegularBuy> getRegularBuys() {
        return regularBuys;
    }


}
