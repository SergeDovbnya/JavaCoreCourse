package module6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Petrov", "Vahtang", 500, 800);
        User user2 = new User(2, "Vasiliy", "Kilka", 299, 231);
        User user3 = new User(3, "Andrei", "Myhailuk", 520,355);
        User user4 = new User(4, "Sergei", "Prohorenko", 150, 3);
        User user5 = new User(5, "Oleg", "Degtyarov", 222, 32);
        User user6 = new User(2, "Vasiliy", "Kilka", 299, 231);
        User[] users = {user1, null, user2, user3, user4, null, user5, user6};

        System.out.println("Users Id " + Arrays.toString(UserUtils.getUsersId(users)));
        System.out.println("Conditional Balance " + Arrays.toString(UserUtils.usersWithContitionalBalance(users, 231)));
        users = UserUtils.uniqueUsers(users);
        System.out.println("Only unique users " + Arrays.toString(users));
        users = UserUtils.paySalaryToUsers(users);
        System.out.println("Salary paid" + Arrays.toString(users));
        System.out.println("Without empty users " + Arrays.toString(UserUtils.deleteEmptyUsers(users)));
    }
}
