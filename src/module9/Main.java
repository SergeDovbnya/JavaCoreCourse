package module9;

import module4.Currency;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Kay", "Sims", "Sydney", 1400);
        User user2 = new User(2, "Alfred", "Hitchcock", "Los Angeles", 5000);
        User user3 = new User(3, "Stasey", "Willberg", "Melbourne", 8850);
        User user4 = new User(4, "Whitney", "Houston", "New Jersey", 4000);
        User user5 = new User(5, "Barbara", "Streisand", "Malibu", 6050);
        User user6 = new User(6, "Casey", "Neistat", "New York", 9999);
        User user7 = new User(7, "Steven", "Byrd", "Essex", 4621);
        User user8 = new User(8, "Jeffrey", "Garza", "Capetown", 3215);
        User user9 = new User(9, "Ivan", "Petrov", "Moscow", 7850);
        User user10 = new User(10, "Amanda", "Gregory", "New York", 2033);
        List<Order> list = new ArrayList<>();
        list.add(new Order(1, 600, Currency.EUR, "IPhone", "Apple", user1));
        list.add(new Order(2, 15, Currency.USD, "Wine", "Spirits & Liquor", user2));
        list.add(new Order(2, 15, Currency.USD, "Wine", "Spirits & Liquor", user2));
        list.add(new Order(4, 99, Currency.USD, "Trampoline", "Amazon", user4));
        list.add(new Order(4, 99, Currency.USD, "Trampoline", "Amazon", user4));
        list.add(new Order(6, 1500, Currency.USD, "DJI Phantom 4", "DJI", user6));
        list.add(new Order(7, 15, Currency.USD, "Kitchen Scale", "Ebay", user7));
        list.add(new Order(8, 700, Currency.EUR, "IPhone", "Apple", user8));
        list.add(new Order(9, 3999, Currency.USD, "Pinball machine", "Ebay", user9));
        list.add(new Order(10, 2000, Currency.EUR, "A decent espresso maker", "Amazon", user10));
        Set<Order> set = new TreeSet<>(list);

        list = Utils.sortByPriceDecrease(list);
        System.out.println("Sorted by price in decreace order" + list);
        list = Utils.sortByPriceIncreaseAndCity(list);
        System.out.println("Sorted by price in increase order and user city" + list);
        list = Utils.sortByItemNameAndShopIdentificatorAndUserCity(list);
        System.out.println("Sorted by itemName and ShopIdentificator and User city" + list);
        System.out.println("List with duplicates contains " + list.size() + " orders");
        list = Utils.deleteDuplicates(list);
        System.out.println("List without duplicates contains " + list.size() + " orders");
        list = Utils.deletePriceLess1500(list);
        System.out.println("Orders only with price more than 1500" + list);
        System.out.println("List, separated by Currency" + Utils.separateByCurrency(list));
        System.out.println("Map grouped by unique cities " + Utils.separateByCities(list));
        System.out.println("Set contains Petrov? - " + Utils.checkName(set, "Petrov"));
        System.out.println("Order with largest price " + Utils.getBiggestOrder(set));
        set = Utils.deleteUsdOrders(set);
        System.out.println("Orders without USD " + set);
    }
}
