package module10;

public class MyOwnException extends Exception{

    public MyOwnException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public void printMessage() {
        System.out.println(getMessage());
    }
}
