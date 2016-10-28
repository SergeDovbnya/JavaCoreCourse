package module10;

public class ThirdException extends Exception {
    public ThirdException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
