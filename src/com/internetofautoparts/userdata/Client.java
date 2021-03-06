package com.internetofautoparts.userdata;

import com.internetofautoparts.discounts.Discount;
import com.internetofautoparts.discounts.ZeroDiscount;

import java.io.Serializable;

/**
 * Created by Andrew on 13.03.2017.
 */
public class Client implements Serializable {

    private static int newId;

    private final int id;
    private final String name;
    private final String surname;
    private final User user;
    private Discount currentDiscount;

    public Client(String name, String surname, User user, Discount currentDiscount) {
        this.id = ++newId;
        this.name = name;
        this.surname = surname;
        this.user = user;
        this.currentDiscount = currentDiscount;
    }

    public Client(String name, String surname, User user) {
        this.id = ++newId;
        this.name = name;
        this.surname = surname;
        this.user = user;
        this.currentDiscount = new ZeroDiscount();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public User getUser() {
        return user;
    }

    public Discount getCurrentDiscount() {
        return currentDiscount;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", currentDiscount=" + currentDiscount.getCurrenPercentOfDiscount() + "%" +
                '}';
    }
}
