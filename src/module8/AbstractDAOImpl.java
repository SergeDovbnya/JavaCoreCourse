package module8;

import java.util.List;

public class AbstractDAOImpl<T extends GetId> implements AbstractDAO<T> {
    private List<T> list;

    public AbstractDAOImpl(List<T> list) {
        this.list = list;
    }

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

    @Override
    public void deleteById(long id) {
        delete(get(id));
    }

    @Override
    public T get(long id) {
        for (T t:list) {
            if (t.getId() == id) return t;
        }
        return null;
    }


}
