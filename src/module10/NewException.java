package module10;

public class NewException extends Exception{
    public NewException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
