package hw1;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        User user = new User("myname", "mail@gmail.com", "mypass" );
        UserService.serializeUser(user);
        UserService.deserializeUser();

        Country c = new Country("Armenia");
        List<Phone> phones = new ArrayList<>();
        Phone phone = new Phone(123456, "Armenia");
        Phone phone2 = new Phone(54356, "USA");
        phones.add(phone);
        phones.add(phone2);
        User user2 = new User("login", "abc@mail.ru", c, phones);
        UserService.serializeUser(user2);
        UserService.deserializeUser();

    }
}