package module2;


public class Task2 {

    //HOMEWORK 2.1
    static double withdrawBalance(double balance, double withdrawal) {
        return balance - withdrawal - commission(withdrawal);
    }

    static double commission(double withdrawal) {
        return withdrawal * 0.05;
    }

    public static void main(String[] args) {
        int balance = 100;
        int withdrawal = 99;

        double balanceAfter = withdrawBalance(balance, withdrawal);
        if (balanceAfter > 0) System.out.println("OK " + commission(withdrawal) + " " + balanceAfter);
        else System.out.println("NO");
    }
}
