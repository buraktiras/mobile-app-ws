package com.appsdeveloperblog.app.ws.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDetailsRequestModel {
    @NotNull(message = "firstname cannot be null")
    private String firstName;

    @NotNull(message = "lastname cannot be null")
    private String lastName;

    @NotNull(message = "email cannot be null")
    @Email
    private String email;

    @NotNull(message = "password cannot be null")
    @Size(min = 8, max = 16, message = "password; more than 8, less than 16 ")
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String userId) {
        this.password = userId;
    }
}
