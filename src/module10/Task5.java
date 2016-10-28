package module10;

public class Task5 {
    public static void throwThree(int num) throws MyOwnException, ThirdException, NewException{
        if (num == 1)throw new MyOwnException("first");
        if (num == 2)throw new NewException("second");
        else throw new ThirdException("else");
    }

    public static void main(String[] args) {
        try {
            throwThree(1);
        } catch (NewException | ThirdException | MyOwnException e) {
            System.out.println(e.getMessage());
        }
    }
}
