package singleton2;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        User user = User.getInstance();
        user.setUsername("Anna");
        user.setEmail("anna@gmail.com");
        UserService.serializeUser(user);

        User user1 = UserService.deserializeUser();
        System.out.println(user1);

    }
}