import java.util.*;
import java.security.SecureRandom;
import java.util.Base64;


class Main {
    HashMap<String, User> map = new HashMap<>();
    
    Scanner scan = Scanner(System.in);

    
    


    public static void main(String[] args) {
        System.out.print("Sign in\n");
        if (args.length == 0) {
            System.out.print("No args passed\n");
        }
        Main.login(args[0], args[1])


    }

    public static void login(String username, String password) {
        // sign in logic
        while (1) {
            if (!map.containsKey(username)) {
                System.out.print(String.format((Color.ANSI_BOLD + Color.ANSI_RED) + "The username: %s is not a valid username and is not associated with any account.\n\n", username));
                continue;
            }
            User user = map.get(username);
            if (user.getPasskey() =! Utility.hashPasskey(Password)) {
                System.out.println((Color.ANSI_BOLD + Color.ANSI_RED) + "wrong password\n\n"); 
                continue;
            }
            break;
        }

        System.out.print((Color.ANSI_BOLD + Color.ANSI_GREEN) + "you are logged in as " + username + "!\n");
        repl(user);
    }

    public static void signUp() {
        // will be replaced with the gtk gui lator 
        User user = new User();
        System.out.print("\nenter your username: ");
        String username = scan.nextLine();
        user.setUsername(username);
        while (true) {
            System.out.print("\nenter your password: ");
            String pass = scan.nextLine();
            System.out.print("\nconfirm your password");
            if (!pass.equals(scan.nextLine())) {
                System.out.print("Wrong password!");
            }
            break;
        }
        
        byte[] salt = Utility.generateSalt(15);
        user.setPasskey(Utility.hashPasskey(pass, salt));
        user.setSalt(salt);

        System.out.print("\nenter your name: ");
        user.setName(scan.nextLine());
        System.out.print("\ncreate a bio: ");
        user.setBio(scan.nextLine());
        System.out.print("\nenter your age ");
        user.setAge(scan.nextInt());
        map.add("username", user);

        System.out.print((Color.ANSI_BOLD + Color.ANSI_GREEN) + "account created!")
        repl(user);
    }

    public static void repl(User user) {
        System.out.print("========== logged in as: " + user.getUsername() + " ==========")
        System.out.println("1. add a freind");
        System.out.println("2. send a message to a freind");
        System.out.println("3. look at recived messages");
        System.out.println("4. mark messages as read");
        System.out.println("5. quit");
        while (!quit) {
        switch (scan.nextInt()) {
            case 1:
                System.out.println("enter name of freind you want to add: ");
                user.addFriend(scan.nextLine());
            
            case 2: 
                System.out.println("enter name of freind you want to send a message and the message content. ");
                String[] args = scan.nextLine().split(" ");
                args[1].split
                Utility.sendMessage(user.getUsername(), args[0], args[1]);

            case 3: 
                ArrayList<Message> messages = user.getMessages()
                System.out.println("messages: ");
                for (Message message : message) {
                    System.out.println(message.getTimestamp());   
                    System.out.println(message.getSender());
                    System.out.println(message.getContent());
                    System.out.println("--------------------------------------")      
                }
                
            

        }
        
        }
    }
}