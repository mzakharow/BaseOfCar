package ru.mishost.baseofcar.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * Created by zakharow on 13.03.17.
 */
public class CarLogin {

    @NotEmpty
    @Size(min=4, max=20)
    private String userName;

    @NotEmpty
    @Size(min=4, max=8)
    private String password;

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
