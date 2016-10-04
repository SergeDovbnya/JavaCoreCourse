package module6;

public class UserUtils {
    static User[] uniqueUsers(User[] users) {
        for (int i = 0; i < users.length - 1; i++) {
            for (int j = i + 1; j < users.length; j++) {
                if (users[i] != null && users[j] != null && users[i].equals(users[j])) users[j] = null;
            }
        }
        return users;
    }


    static User[] usersWithContitionalBalance(User[] users, int balance) {
        User[] users1 = new User[users.length];
        int index = 0;
        for (User user : users) {
            if (user != null) {
                if (user.getBalance() == balance) {
                    users1[index] = user;
                    index++;
                }
            }
        }
        return users1;
    }


     static final User[] paySalaryToUsers(User[] users) {
         for (User user: users) {
             if (user != null) user.setBalance(user.getBalance() + user.getSalary());
         }
         return users;
    }

    static final long[] getUsersId(User[] users) {
        long[] usersId = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) usersId[i] = users[i].getId();
        }
        return usersId;
    }

    static User[] deleteEmptyUsers(User[] users) {
        int counter = 0;

        for (User user: users) {
            if (user != null) counter++;
        }

        User[] users1 = new User[counter];
        int index = 0;
        for (User user: users) {
            if (user != null) {
                users1[index] = user;
                index++;
            }
        }
        return users1;
    }
}
