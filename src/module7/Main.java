package module7;

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

        list.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice(); // sort list by Order price in decrease order
            }
        });
        System.out.println("Sorted by price in decreace order" + list);

        list.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int res = o1.getPrice() - o2.getPrice();
                if (res == 0) return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                else return res;
            }
        });
        System.out.println("Sorted by price in increase order and user city" + list);

        list.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int res = o1.getItemName().compareTo(o2.getItemName());
                if (res == 0) {
                    res = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                    if (res == 0) return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                    else return res;
                } else return res;
            }
        });
        System.out.println("Sorted by itemName and ShopIdentificator and User city" + list);

//        deleting duplicates in list
        Set<Order> set1 = new LinkedHashSet<>(list);
        System.out.println("List with duplicates contains " + list.size() + " orders");
        list.clear();
        list.addAll(set1);
        System.out.println("List without duplicates contains " + list.size() + " orders");

//        delete items where price less than 1500
        list.removeIf(order -> order.getPrice() < 1500);
//        for (Iterator<Order> it = list.listIterator(); it.hasNext();) {
//            if (it.next().getPrice() < 1500) it.remove();
//        }
        System.out.println("Orders only with price more than 1500" + list);

//        separate list by Currency
        List<Order> usdList = new ArrayList<>();
        List<Order> eurList = new ArrayList<>();
        for (Order order : list) {
            if (order.getCurrency() == Currency.EUR) eurList.add(order);
            else usdList.add(order);
        }
//        eurList = list.stream().filter(order -> order.getCurrency() == Currency.EUR).collect(Collectors.toList());
//        usdList = list.stream().filter(order -> order.getCurrency() == Currency.USD).collect(Collectors.toList());
        System.out.println("List, where currency is EUR" + eurList);
        System.out.println("List, where currency is USD" + usdList);

//        separate list for as many lists as many unique cities are in User
        List<List<Order>> uniqueCities = new ArrayList<>();
        Set<String> cities = new HashSet<>();
        List<Order> temp;
        for (Iterator<Order> it = list.listIterator(); it.hasNext();) {
            cities.add(it.next().getUser().getCity());
        }
        for (String city: cities) {
            temp = new ArrayList<>();
            uniqueCities.add(temp);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getUser().getCity() == city) temp.add(list.get(i));
            }
        }
        System.out.println("List by unique cities " + uniqueCities);

//        check if set contain Order where User’s lastName is - “Petrov”
        boolean flag = false;
        String searchedName = "Petrov";
        for (Iterator<Order> it = set.iterator(); it.hasNext();) {
            if (it.next().getUser().getLastName() == searchedName) flag=true;
        }
        System.out.println("Set contains Petrov? -" + flag);

//        print Order with largest price using only one set method - get
        Iterator iterator = set.iterator();
        System.out.println("Order with largest price " + iterator.next());

//        delete orders where currency is USD using Iterator
        set.removeIf(order -> order.getCurrency() == Currency.USD);
//        for (Iterator<Order> it = set.iterator(); it.hasNext();) {
//            if (it.next().getCurrency() == Currency.USD) it.remove();
//        }
        System.out.println("Orders without USD " + set);
    }
}
