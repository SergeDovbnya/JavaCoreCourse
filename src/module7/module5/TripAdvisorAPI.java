package module7.module5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TripAdvisorAPI implements API {
    private List<Room> rooms = new ArrayList<>();
    private Date date = new Date(116, 11, 15);

    public TripAdvisorAPI() {
        rooms.add(new Room(1, 200, 2, date, "Kooperator", "Chygyryn"));
        rooms.add(new Room(2, 300, 1, date, "Stolychnyi", "Kyiv"));
        rooms.add(new Room(3, 250, 3, date, "Arena", "Kherson"));
        rooms.add(new Room(4, 400, 3, date, "Vody", "Valyava"));
        rooms.add(new Room(5, 350, 2, date, "Pechera", "Lviv"));
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
