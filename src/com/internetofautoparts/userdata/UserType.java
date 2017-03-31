package com.internetofautoparts.userdata;

import java.io.Serializable;

/**
 * Created by Andrew on 13.03.2017.
 */
public enum UserType implements Serializable{

    ADMINISTRATOR(0), MANAGER(1), CLIENT(2);
    private final int id;

    UserType(int id) {
        this.id = id;
    }
}
