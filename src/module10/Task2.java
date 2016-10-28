package module10;

public class Task2 {
    public static void main(String[] args) {
        try {
            throw new MyOwnException("String");
        } catch (MyOwnException e) {
            e.printMessage();
        }
    }
}
