package module7.module5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        API bookingAPI = new BookingComAPI();
        API tripAPI = new TripAdvisorAPI();
        API googleAPI = new GoogleAPI();
        List<API> apis = new ArrayList<>();
        apis.add(bookingAPI);
        apis.add(tripAPI);
        apis.add(googleAPI);
        Controller controller = new Controller(apis);

        controller.requestRooms(300, 1, "Kyiv", "Stolychnyi");
        controller.requestRooms(200, 2, "Korsun", null);
        controller.requestRooms(400, 3, "sdaf", null);
        controller.check(bookingAPI, tripAPI);
        controller.check(tripAPI, googleAPI);
        controller.check(googleAPI, bookingAPI);
    }
}
