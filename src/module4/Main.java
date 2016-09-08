package module4;

public class Main {
    public static void main(String[] args) {
        Bank usBank = new USBank(1, "USA", Currency.USD, 20, 3000, 9, 321565622);
        Bank euBank = new EUBank(2, "Switzerland", Currency.EUR, 30, 5000, 10, 2103468213);
        Bank chinaBank = new ChinaBank(3, "China", Currency.USD, 500, 500, 8, 1546565655);
        User user1 = new User("Tom", 10000, 3240, usBank);
        User user2 = new User("Jack", 15000, 1580, usBank);
        User user3 = new User("Rico", 12221, 2130, euBank);
        User user4 = new User("Daniel", 3221, 2310, euBank);
        User user5 = new User("Chan", 1111, 233, chinaBank);
        User user6 = new User("Lao", 2222, 322, chinaBank);
        BankSystem bankSystem = new BankSystemImpl();

        bankSystem.withdrawOfUser(user1,2000);
        bankSystem.fundUser(user1, 1000);
        bankSystem.paySalary(user1);
        bankSystem.transferMoney(user1, user2, 555);
        System.out.println(user1);

        bankSystem.withdrawOfUser(user2,900);
        bankSystem.fundUser(user2, 500);
        bankSystem.paySalary(user2);
        bankSystem.transferMoney(user2, user3, 1805);
        System.out.println(user2);

        bankSystem.withdrawOfUser(user3,985);
        bankSystem.fundUser(user3, 1501);
        bankSystem.paySalary(user3);
        bankSystem.transferMoney(user3, user4, 650);
        System.out.println(user3);

        bankSystem.withdrawOfUser(user4,350);
        bankSystem.fundUser(user4, 9999);
        bankSystem.paySalary(user4);
        bankSystem.transferMoney(user4, user5, 1234);
        System.out.println(user4);

        bankSystem.withdrawOfUser(user5,2505);
        bankSystem.fundUser(user5, 1020);
        bankSystem.paySalary(user5);
        bankSystem.transferMoney(user5, user6, 555);
        System.out.println(user5);

        bankSystem.withdrawOfUser(user6,900);
        bankSystem.fundUser(user6, 1000);
        bankSystem.paySalary(user6);
        bankSystem.transferMoney(user6, user1, 555);
        System.out.println(user6);
    }
}
