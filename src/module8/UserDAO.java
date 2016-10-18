package module8;

import java.util.List;

public class UserDAO extends AbstractDAOImpl {

    public UserDAO(List list) {
        super(list);
    }

    public User save(User user) {
        save(user);
        return user;
    }

    public void delete(User user) {
        delete(user);
    }
}
