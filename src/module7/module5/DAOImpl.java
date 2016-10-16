package module7.module5;

import java.util.ArrayList;
import java.util.List;

public class DAOImpl implements DAO{
    private static List<Room> list = new ArrayList<>();

    @Override
    public Room save(Room room) {
        list.add(room);
        System.out.println(room.toString() + " is saved");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        if (list.contains(room)) {
            list.remove(room);
            System.out.println(room.toString() + " is deleted");
            return true;
        } else return false;
    }

    @Override
    public Room update(Room room) {
        Room room1 = findById(room.getId());
        int index = list.indexOf(room1);
        list.set(index, room);
        System.out.println(room.toString() + " is updated");
        return room;
    }

    @Override
    public Room findById(long id) {
        List<Room> result = new ArrayList();
        list.forEach(room -> {
            if (room.getId() == id) result.add(room);
        });
        return result.get(0);
    }

    @Override
    public List<Room> getList() {
        return list;
    }
}
