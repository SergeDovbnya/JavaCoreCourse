package module10;

public class Task4 {
    public static void g() throws NewException{
        System.out.println("method g throwed exception");
        throw new NewException("inside g");
    }

    public static void f() throws ThirdException{
        try {
            g();
        } catch (NewException e) {
            System.out.println("method f throwed exception");
            throw new ThirdException("inside f");
        }
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (ThirdException e) {
            System.out.println("exception in main");
        }
    }
}
