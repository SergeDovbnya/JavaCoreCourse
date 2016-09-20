package module5;

import java.util.Arrays;

public class Controller {
    private API apis[] = new API[3];

    public Controller(API[] apis) {
        this.apis = apis;
    }

    Room[] requestRooms(int price, int persons, String city, String hotel) {
        Room[] result1 = new Room[5];
        Room[] result2 = new Room[5];
        Room[] result3 = new Room[5];
        Room[][] result = {result1, result2, result3};
        Room[] res = new Room[15];
        DAO dao = new DAOImpl();

        for (int i = 0; i < apis.length; i++) {
            result[i] = apis[i].findRooms(price, persons, city, hotel);
            for (Room room : result[i]) {
                if (room != null) dao.save(room);
            }
            System.arraycopy(result[i], 0, res, i*5, result[i].length);
        }
        System.out.println(Arrays.deepToString(res));
        return  res;
    }

    Room[] check(API api1, API api2) {
        int i = 0;
        Room[] result = new Room[10];
        Room[] rooms1 = api1.getAllRooms();
        Room[] rooms2 = api2.getAllRooms();

        for (Room room1: rooms1) {
            for (Room room2: rooms2) {
                if (room1.equals(room2)) {
                    result[i] = room2;
                    i++;
                }
            }
        }
        System.out.println(Arrays.deepToString(result));
        return result;
    }
}
