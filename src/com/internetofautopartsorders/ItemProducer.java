package internetofautopartsorders;

public class ItemProducer {
    private final String name;
    private final String phone;

    public ItemProducer(String name, String contacts) {
        this.name = name;
        this.contacts = contacts;
    }
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "ItemProducer{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

