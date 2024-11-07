import java.security.SecureRandom;
import java.util.Base64;
import java.security.MessageDigest;
import com.google.gson.Gson;
import java.io.*;
import java.net.*;
import java.util.*;

public class Utility {
    private HashMap<String, User> map;
    Gson gson = new Gson();
    
    static private void makeRequest() {
        URL url = new URL("https://ngronk url here");
        

    } 

    static public void setHashmap(HashMap<String, User> mapp) {
        map = mapp;
    }

    static public byte[] generateSalt(int length) {
        byte[] salt = new byte[length];
        new SecureRandom().nextBytes(salt);
        return salt;
    }

    static public String hashPasskey(String password, byte[] salt) {
        byte[] passwordBytes = password.getBytes();
        byte[] combined = new byte[salt.length + passwordBytes.length];
        // combine
        System.arraycopy(salt, 0, combined, 0, salt.length);
        System.arraycopy(passwordBytes, 0, combined, salt.length, passwordBytes.length);
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(combined);

        return Base64.getEncoder().encodeToString(hash);

    }

    static public Message sendMessage(String sender, String receiver, String content) {
        Message message = new Message(sender, receiver, content);
        String json = gson.tojson(message);
        

    }

}
