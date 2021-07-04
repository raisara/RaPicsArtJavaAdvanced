package singleton2;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class UserService {
    private static final String FILE_NAME = "user.txt";

    public static void serializeUser(User user){
        try(FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            ) {
                oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static User deserializeUser(){
        User u = null;
        try(FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            Object obj = ois.readObject();
            u = (User) obj;
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return u;
    }
}
