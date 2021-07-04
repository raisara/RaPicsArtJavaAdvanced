package singleton;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class UserService {
    private static final String FILE_NAME = "user.xml";

    public static void serializeUser(User user){
        try(FileOutputStream fos = new FileOutputStream(FILE_NAME);
            XMLEncoder encoder = new XMLEncoder(fos);
            ) {
                encoder.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static User deserializeUser(){
        User u = null;
        try(FileInputStream fis = new FileInputStream(FILE_NAME);
            XMLDecoder decoder = new XMLDecoder(fis);
        ) {
            Object obj = decoder.readObject();
            u = (User) obj;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return u;
    }
}
