/**
 * Created by Andrew on 13.03.2017.
 */
public class Client {

    private static int newId;

    private final int id;
    private final String name;
    private final String surname;
    private final User user;
    private Discount currentDiscount;

    public Client(int id, String name, String surname, User user, Discount currentDiscount) {
        this.id = ++newId;
        this.name = name;
        this.surname = surname;
        this.user = user;
        this.currentDiscount = currentDiscount;
    }
}
