
import java.util.*;
// sub intretses with bio
class User {
    private ArrayList<String> friends = new ArrayList<>();
    private ArrayList<Message> messages = new ArrayList<>();
    private String username;
    // base64 encoded hash
    private String passkey;
    private String name;
    private String bio;
    // stored as a byte array
    private byte[] salt;
    private int age;

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public String getUsername() {
        return username;
    }
    public String getPasskey() {
        return passkey;
    }
    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }
     
    public String getAge() {
        return age;
    }
    public String getSalt() {
        return salt
    }

    public ArrayList<String> getfriends() {
        return friends;
    }

    public void setUsername(String username) {
        if (length(username) > 15) {
            throw new IllegalArgumentException("username cannot be greater then 15 chars");
        }
        this.username = username;
    }

    public void setPasskey(String passkey) {
        this.passkey = passkey
    }

    public void setName(String name) {
        if (length(name) > 15) {
            throw new IllegalArgumentException("name cannot be greater then 15 chars");
        }
        this.name = name;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
     
    public void setAge(int age) {
        this.age = age;
    }

    public void setSalt(byte[] salt) {
        this.salt = salt
    }
 
    public void addFriend(String user) {
        friends.add(user);
    }
    

}