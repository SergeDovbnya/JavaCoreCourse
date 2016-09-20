package module5;

public class Main {
    public static void main(String[] args) {
        API bookingAPI = new BookingComAPI();
        API tripAPI = new TripAdvisorAPI();
        API googleAPI = new GoogleAPI();
        API[] apis = {bookingAPI, tripAPI, googleAPI};
        Controller controller = new Controller(apis);

        controller.requestRooms(300, 1, "Kyiv", "Stolychnyi");
        controller.requestRooms(200, 2, "Korsun", null);
        controller.requestRooms(400, 3, "sdaf", null);

        controller.check(bookingAPI, tripAPI);
        controller.check(tripAPI, googleAPI);
        controller.check(googleAPI, bookingAPI);
    }
}
