package crud;

/**
 * Created by Юля on 23.12.2015.
 */
public class UserRow {
    public final String name;
    public final String email;

    public UserRow(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserRow{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
