package module2;

public class Task2 {

    static double[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    //HOMEWORK 2.1
    static String withdrawBalance(double balance, double withdrawal) {
        double commission = withdrawal * 0.05;
        if (balance >  withdrawal + commission) {
            balance = balance - withdrawal - commission;
            return "OK " + commission + " " + balance;
        } else return "NO";
    }

    //HOMEWORK 2.2
    static String withdrawBalance(String ownerName, double withdrawal) {
        double commission = withdrawal * 0.05;
        int ownerPosition = getOwnerPosition(ownerName);
        if (balances[ownerPosition] > withdrawal + commission) {
            balances[ownerPosition] = balances[ownerPosition] - withdrawal - commission;
            return ownerName + " " + withdrawal + " " + balances[ownerPosition];
        } else return ownerName + " NO";
    }

    //HOMEWORK 2.3
    static String fundBalance(String ownerName, double fund) {
        int ownerPosition = getOwnerPosition(ownerName);
        balances[ownerPosition] = balances[ownerPosition] + fund;
        return ownerName + " " + balances[ownerPosition];
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
