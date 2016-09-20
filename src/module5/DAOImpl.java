package module5;

public class DAOImpl implements DAO{
    @Override
    public Room save(Room room) {
        System.out.println(room.toString() + " is saved");
        return null;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room.toString() + " is deleted");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room.toString() + " is updated");
        return room;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(id, 0, 0, null, null, null);
        System.out.println(room.toString() + " is found");
        return room;
    }
}
