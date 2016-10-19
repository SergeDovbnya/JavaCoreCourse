package module8;

import java.util.List;

public class UserDAO<T extends User> extends AbstractDAOImpl {

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

//    public void deleteAll(List<User> list) {
//        deleteAll(list);
//    }
//    Doesn't work?

    @Override
    public void saveAll(List list) {
        super.saveAll(list);
    }

    @Override
    public List getlist() {
        return super.getlist();
    }

    @Override
    public void deleteById(long id) {
        super.deleteById(id);
    }

    @Override
    public GetId get(long id) {
        return super.get(id);
    }
}
