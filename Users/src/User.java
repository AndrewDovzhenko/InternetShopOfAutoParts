/**
 * Created by Andrew on 13.03.2017.
 */
public class User {
    private final String login;
    private final String password;
    private final UserType typeOfUser;

    public User(String login, String password, UserType typeOfUser) {
        this.login = login;
        this.password = password;
        this.typeOfUser = typeOfUser;
    }
}
