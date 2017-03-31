package com.internetofautoparts.userdata;

import java.io.Serializable;

/**
 * Created by Andrew on 13.03.2017.
 */
public class User implements Serializable {
    private final String login;
    private final String password;
    private final UserType typeOfUser;

    public User(String login, String password, UserType typeOfUser) {
        this.login = login;
        this.password = password;
        this.typeOfUser = typeOfUser;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public UserType getTypeOfUser() {
        return typeOfUser;
    }



}
