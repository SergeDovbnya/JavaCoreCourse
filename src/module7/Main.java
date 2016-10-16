package module7;

import com.sun.org.apache.xpath.internal.operations.Or;
import module4.*;
import module4.Currency;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Kay", "Sims", "Sydney", 1400);
        User user1 = new User(2, "Alfred", "Hitchcock", "Los Angeles", 5000);
        User user2 = new User(3, "Stasey", "Willberg", "Melbourne", 8850);
        User user3 = new User(4, "Whitney", "Houston", "New Jersey", 4000);
        User user4 = new User(5, "Barbara", "Streisand", "Malibu", 6050);
        User user5 = new User(6, "Casey", "Neistat", "New York", 9999);
        User user6 = new User(7, "Steven", "Byrd", "Essex", 4621);
        User user7 = new User(8, "Jeffrey", "Garza", "Capetown", 3215);
        User user8 = new User(9, "Ivan", "Petrov", "Moscow", 7850);
        User user9 = new User(10, "Amanda", "Gregory", "San Francisco", 2033);
        Order order = new Order(1, 600, Currency.EUR, "IPhone", "Apple", user);
        Order order1 = new Order(2, 15, Currency.USD, "Wine", "Spirits & Liquor", user1);
        Order order2 = new Order(3, 200, Currency.EUR, "GiroBoard", "Citrus", user2);
//        Order order2 = new Order(3, 200, Currency.EUR, "GiroBoard", "Citrus", user2);
        Order order3 = new Order(4, 99, Currency.USD, "Trampoline", "Amazon", user3);
        Order order4 = new Order(4, 99, Currency.USD, "Trampoline", "Amazon", user3);
//        Order order4 = new Order(5, 20, Currency.EUR, "Gym membership", "Athlete", user4);
        Order order5 = new Order(6, 1199, Currency.USD, "DJI Phantom 4", "DJI", user5);
        Order order6 = new Order(7, 15, Currency.USD, "Kitchen Scale", "Ebay", user6);
        Order order7 = new Order(8, 700, Currency.EUR, "IPhone", "Apple", user7);
        Order order8 = new Order(9, 3999, Currency.USD, "Pinball machine", "Ebay", user8);
        Order order9 = new Order(10, 2000, Currency.EUR, "A decent espresso maker", "Amazon", user9);
        List<Order> list = new ArrayList<>(Arrays.asList(order, order1, order2, order3, order4, order5, order6, order7, order8, order9));
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
        System.out.println("List with duplicates " + list.size());
        list.clear();
        list.addAll(set1);
        System.out.println("List without duplicates " + list.size());

//        delete items where price less than 1500
        Iterator<Order> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().getPrice() < 1500) iterator.remove();
        }
        System.out.println("Orders only with price more than 1500" + list);

//        separate list by Currency
        List<Order> usdList = new ArrayList<>();
        List<Order> eurList = new ArrayList<>();
        for (Order item : list) {
            if (item.getCurrency() == Currency.EUR) eurList.add(item);
            else usdList.add(item);
        }
        System.out.println("List, where currency is EUR" + eurList);
        System.out.println("List, where currency is USD" + usdList);

//        separate list for as many lists as many unique cities are in User


//        check if set contain Order where User’s lastName is - “Petrov”
        boolean flag = false;
        Iterator<Order> iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next().getUser().getLastName() == "Petrov") flag=true;
        }
        System.out.println("Set contains Petrov? " + flag);

//        print Order with largest price using only one set method - get
        Iterator iterator3 = set.iterator();
        System.out.println("Order with largest price " + iterator3.next());

//        delete orders where currency is USD using Iterator
        Iterator<Order> iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().getCurrency() == Currency.USD) iterator1.remove();
        }
        System.out.println("Orders without USD " + set);



//        Extra Homework

        List<Integer> integerArrayList = new ArrayList<>();
        List<String> stringArrayList = new ArrayList<>();
        List<Integer> integerLinkedList = new LinkedList<>();
        List<String> stringLinkedList = new LinkedList<>();
        int counter1 = 1000;
        int counter2 = 10000;
        Random randomInt = new Random();
        String someString = "SomeString";
        while (counter1 > 0) {
            integerArrayList.add(randomInt.nextInt());
            stringArrayList.add(someString);
            integerLinkedList.add(randomInt.nextInt());
            stringLinkedList.add(someString);
            counter1--;
        }

        long start = System.currentTimeMillis();

        while (counter1 > 0) {
            integerArrayList.add(randomInt.nextInt());
            counter1--;
        }

        long finish = System.currentTimeMillis();
        System.out.println(finish - start + " add operation in integer ArrayList with 1000 Elements");




        while (counter2 > 0) {
            integerArrayList.add(randomInt.nextInt());
            stringArrayList.add(someString);
            integerLinkedList.add(randomInt.nextInt());
            stringLinkedList.add(someString);
            counter2--;
        }
    }
}
