package module7.module5;

import java.util.*;

public class Controller {
    private List<API> apis = new ArrayList<>();

    public Controller(List<API> apis) {
        this.apis = apis;
    }

    List<Room> requestRooms(int price, int persons, String city, String hotel) {
        List<Room> result = new ArrayList<>();
        DAO dao = new DAOImpl();

        for (API api: apis) {
            result.addAll(api.findRooms(price, persons, city, hotel));
        }
        System.out.println(result);
//        Room room = new Room(2, price, persons, new Date(), hotel, city);
//        result.forEach(dao::save);
//        dao.delete(result.get(0));
//        dao.update(room);
        return result;
    }

    List<Room> check(API api1, API api2) {
//        Set<Room> set = new HashSet<>();
//        List<Room> roomList = new ArrayList<>();
//
//        roomList.addAll(api1.getAllRooms());
//        roomList.addAll(api2.getAllRooms());
//        roomList.forEach((room -> {if (!set.add(room)) result.add(room);}));

        Set<Room> set1 = new HashSet<>(api1.getAllRooms());
        Set<Room> set2 = new HashSet<>(api2.getAllRooms());
        set1.retainAll(set2);
        List<Room> result = new ArrayList<>(set1);
        System.out.println(result);
        return result;
    }
}
