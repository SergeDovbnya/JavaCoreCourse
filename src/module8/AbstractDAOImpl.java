package module8;

import java.util.ArrayList;
import java.util.List;

public class AbstractDAOImpl<T> implements AbstractDAO<T> {
    private List<T> list = new ArrayList<T>();

    @Override
    public T save(T t) {
        list.add(t);
        return t;
    }

    @Override
    public void delete(T t) {
        list.remove(t);
    }

    @Override
    public void deleteAll(List<T> tList) {
        list.removeAll(tList);
    }

    @Override
    public void saveAll(List<T> tList) {
        list.addAll(tList);
    }

    @Override
    public List<T> getlist() {
        return list;
    }
}
