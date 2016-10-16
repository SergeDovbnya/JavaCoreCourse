package module7.module5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoogleAPI implements API{
    private List<Room> rooms = new ArrayList<>();
    private Date date = new Date(116, 10, 15);

    public GoogleAPI() {
        rooms.add(new Room(1, 250, 2, date, "Kooperator", "Korsun"));
        rooms.add(new Room(2, 300, 1, date, "Stolychnyi", "Kyiv"));
        rooms.add(new Room(3, 250, 3, date, "Arena", "Kherson"));
        rooms.add(new Room(4, 400, 1, date, "Vody", "Valyava"));
        rooms.add(new Room(5, 325, 2, date, "Pechera", "Lviv"));
    }

    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        List<Room> result = new ArrayList<>();
        Room room = new Room(0, price, persons, null, hotel, city);
        for (Room room1: rooms) {
            if (room.equals(room1)) {
                result.add(room1);
            }
        }
        return result;
    }

    @Override
    public List<Room> getAllRooms() {
        return rooms;
    }
}
