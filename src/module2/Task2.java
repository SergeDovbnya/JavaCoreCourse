package module2;


public class Task2 {

    static double[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    //HOMEWORK 2.1
    static String withdrawBalance(double balance, double withdrawal) {
        double commission = withdrawal * 0.05;
        String message;
        if (balance >  withdrawal + commission) {
            balance = balance - withdrawal - commission;
            message = "OK " + commission + " " + balance;
        } else message = "NO";

        return message;

    }

    //HOMEWORK 2.2
    static String withdrawBalance(String ownerName, double withdrawal) {
        double commission = withdrawal * 0.05;
        String message;

        if (balances[getOwnerPosition(ownerName)] > withdrawal + commission) {
            balances[getOwnerPosition(ownerName)] = balances[getOwnerPosition(ownerName)] - withdrawal - commission;
            message = ownerName + " " + withdrawal + " " + balances[getOwnerPosition(ownerName)];
        } else message = ownerName + " NO";

        return message;

    }

    //HOMEWORK 2.3
    static String fundBalance(String ownerName, double fund) {

        balances[getOwnerPosition(ownerName)] = balances[getOwnerPosition(ownerName)] + fund;
        return ownerName + " " + balances[getOwnerPosition(ownerName)];

    }

    static int getOwnerPosition(String ownerName) {
        int k = 0;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerName == ownerNames[i]) k = i;
        }
        return k;
    }


    public static void main(String[] args) {
        int balance = 400;
        double fund = 100;
        double withdrawal = 240;
        String ownerName = "Ann";

        System.out.println(withdrawBalance(balance,withdrawal));
        System.out.println(withdrawBalance(ownerName, withdrawal));
        System.out.println(fundBalance(ownerName, fund));

    }
}
