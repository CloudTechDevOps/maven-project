package com.project;

import java.util.ResourceBundle;

public class App {

    public int userLogin(String in_user, String in_pwd) {
        ResourceBundle rb = ResourceBundle.getBundle("config");
        String username = rb.getString("username");
        String password = rb.getString("password");

        if (in_user.equals(username) && in_pwd.equals(password)) {
            return 1;
        } else {
            return 0;
        }
    }
}
