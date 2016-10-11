package module7.module5;

import java.util.Date;

public class BookingComAPI implements API {
    private Room[] rooms = new Room[5];
    private Date date = new Date(116, 12, 15);

    public BookingComAPI() {
        Room room1 = new Room(1, 200, 2, date, "Kooperator", "Korsun");
        Room room2 = new Room(2, 300, 1, date, "Stolychnyi", "Kyiv");
        Room room3 = new Room(3, 250, 2, date, "Arena", "Kherson");
        Room room4 = new Room(4, 400, 3, date, "Vody", "Valyava");
        Room room5 = new Room(5, 350, 2, date, "Pechera", "Lviv");
        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;
        rooms[3] = room4;
        rooms[4] = room5;
    }


    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] result = new Room[5];
        Room room = new Room(0, price, persons, null, hotel, city);
        int i = 0;
        for (Room room1: rooms) {
            if (room.equals(room1)) {
                result[i] = room1;
                i++;
            }
        }
        return result;
    }

    @Override
    public Room[] getAllRooms() {
        return rooms;
    }
}
