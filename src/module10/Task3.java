package module10;

import module9.User;

public class Task3 {
    public static void main(String[] args) {
        User user = null;
        try {
            System.out.println(user.getCity());
        } catch (NullPointerException e) {
            System.out.println("Object reference is null");
        }
    }
}
