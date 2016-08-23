package module2;


public class Task4 {

    //HOMEWORK 2.3
    static double fundBalance(String ownerName, double fund, int balances[], String ownerNames[]) {
        double ownerBalance = 0;

        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerName == ownerNames[i]) ownerBalance = balances[i];
        }

        return ownerBalance + fund;
    }


    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Oww";
        double fund = 100;

        double balanceAfter = fundBalance(ownerName, fund, balances, ownerNames);
        System.out.println(ownerName + " " + balanceAfter);

    }
}
