package module10;

public class Task1 {
    public static void main(String[] args) {
        try {
            throw new Exception("argument");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I was here");
        }
    }
}
