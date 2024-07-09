package models;

import com.github.javafaker.Faker;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User() {
        Faker faker = new Faker();
        this.firstName = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.email = faker.internet().safeEmailAddress();
        this.password = "Test12345*";
    }

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

    public void setPassword(String password) {
        this.password = password;
    }
}
