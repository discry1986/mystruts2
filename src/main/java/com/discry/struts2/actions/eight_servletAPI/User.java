package com.discry.struts2.actions.eight_servletAPI;

/**
 * Created by Zhoujp1 on 2016-11-28.
 */
public class User {
    private String username;
    private String password;

    public String getUsername() {
        System.out.println("getUsername()" + username);
        return username;
    }

    public void setUsername(String username) {
        System.out.println("setUsername()" + username);
        this.username = username;
    }

    public String getPassword() {
        System.out.println("getPassword()" + password);
        return password;
    }

    public void setPassword(String password) {
        System.out.println("setPassword()" + password);
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
