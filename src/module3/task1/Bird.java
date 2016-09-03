package module3.task1;

public class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }

    void sing() {
        System.out.println("I am singing");
    }
    @Override
    public String toString() {
        return "I am Bird";
    }
}
