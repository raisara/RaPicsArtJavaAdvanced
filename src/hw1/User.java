package hw1;

import java.beans.Transient;
import java.sql.SQLOutput;
import java.util.List;

public class User {
    private String username;
    private int year;
    private String email;
    private String password;
    private Country country;
    private List<Phone> phones;

    public User() {
    }

    public User(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
    }


    public User(String username, String email, Country country, List<Phone> phones) {
        this.username = username;
        this.email = email;
        this.country = country;
        this.phones = phones;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Transient
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", country=" + country +
                ", phones=" + phones +
                '}';
    }
}
