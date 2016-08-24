package module2;


public class Task2 {

    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};


    //HOMEWORK 2.1
    static double withdrawBalance(double balance, double withdrawal) {
        double commission = withdrawal * 0.05;

        return balance - withdrawal - commission;
    }

    //HOMEWORK 2.2
    static double withdrawBalance(String ownerName, double withdrawal) {
        double ownerBalance = balances[getOwnerPosition(ownerName)];

        return withdrawBalance(ownerBalance, withdrawal);
    }

    //HOMEWORK 2.3
    static double fundBalance(String ownerName, double fund) {
        double ownerBalance = balances[getOwnerPosition(ownerName)];

        return ownerBalance + fund;
    }

    static int getOwnerPosition(String ownerName) {
        int k = 0;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerName.equalsIgnoreCase(ownerNames[i])) k = i;
        }
        return k;
    }


    public static void main(String[] args) {
        int balance = 400;
        double fund = 100;
        double withdrawal = 100;
        String ownerName = "Ann";
        double commission = withdrawal *0.05;
        double balanceAfter;

        balanceAfter = withdrawBalance(balance, withdrawal);            //2.1
        if (balanceAfter > 0) System.out.println("OK " + commission + " " + balanceAfter);
        else System.out.println("NO");

        balanceAfter = withdrawBalance(ownerName, withdrawal);   //2.2
        if (balanceAfter > 0) System.out.println(ownerName + " " + withdrawal + " " + balanceAfter);
        else System.out.println(ownerName + " NO");

        balanceAfter = fundBalance(ownerName, fund);                    //2.3
        System.out.println(ownerName + " " + balanceAfter);

    }
}
