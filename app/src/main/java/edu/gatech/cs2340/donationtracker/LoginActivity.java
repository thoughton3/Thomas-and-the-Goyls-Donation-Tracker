package edu.gatech.cs2340.donationtracker;
import java.util.ArrayList;
import java.util.HashMap;

public class LoginActivity {
    private static HashMap<String, String> userData = new HashMap<>();
    private static ArrayList<User> userList = new ArrayList<>();

    public static void addUser(User user) {
        if(userData.put(user.getUsername(), user.getPassword()) == null) {
            userList.add(user);
        }
    }

    public static boolean login(User user) {
        if (userData.get(user.getUsername()) != null) {
            return (userData.get(user.getUsername()).equals(user.getPassword()));
        } else {
            return false;
        }
    }

    public static String getName(String username) {
        return userList.get(userList.indexOf(new User(username, ""))).getName();
    }

    public static AccountType getAccountType(String username) {
        return userList.get(userList.indexOf(new User(username, ""))).getAccountType();
    }
}
