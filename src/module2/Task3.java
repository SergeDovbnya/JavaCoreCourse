package module2;


public class Task3 {

    //HOMEWORK 2.2
    static double withdrawBalance(String ownerName, double withdrawal, int balances[], String ownerNames[]) {
        int ownerPosition = 0;
        double ownerBalance;
        double commission = withdrawal * 0.05;

        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerName == ownerNames[i]) ownerPosition = i;
        }
        ownerBalance = balances[ownerPosition];

        return ownerBalance - withdrawal - commission;
    }


    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Oww";
        double withdrawal = 490;

        double balanceAfter = withdrawBalance(ownerName, withdrawal, balances, ownerNames);

        if (balanceAfter > 0) System.out.println(ownerName + " " + withdrawal + " " + balanceAfter);
        else System.out.println(ownerName + " NO");

    }
}
