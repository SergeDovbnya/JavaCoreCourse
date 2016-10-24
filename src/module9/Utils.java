package module9;

import module4.Currency;

import java.util.*;
import java.util.stream.Collectors;

public class Utils {
    public static List<Order> sortByPriceDecrease(List<Order> list) {
        return list.stream().sorted((o1, o2) -> o2.getPrice() - o1.getPrice()).collect(Collectors.toList());
    }

    public static List<Order> sortByPriceIncreaseAndCity(List<Order> list) {
        return list.stream().sorted((o1, o2) -> o1.getPrice() != o2.getPrice() ? o1.getPrice() - o2.getPrice() :
                o1.getUser().getCity().compareTo(o2.getUser().getCity())).collect(Collectors.toList());
    }

    public static List<Order> sortByItemNameAndShopIdentificatorAndUserCity(List<Order> list) {
        return list.stream().sorted((o1, o2) -> !o1.getItemName().equals(o2.getItemName()) ? o1.getItemName().compareTo(o2.getItemName()) :
                !o1.getShopIdentificator().equals(o2.getShopIdentificator()) ? o1.getShopIdentificator().compareTo(o2.getShopIdentificator()) :
                        o1.getUser().getCity().compareTo(o2.getUser().getCity())).collect(Collectors.toList());
    }

    public static List<Order> deleteDuplicates(List<Order> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }

    public static List<Order> deletePriceLess1500(List<Order> list) {
        return list.stream().filter(o -> o.getPrice() >= 1500).collect(Collectors.toList());
    }

    public static Map<Currency, List<Order>> separateByCurrency(List<Order> list) {
        return list.stream().collect(Collectors.groupingBy(Order::getCurrency));
    }

    public static Map<String, List<Order>> separateByCities(List<Order> list) {
        return list.stream().collect(Collectors.groupingBy(o -> o.getUser().getCity()));
    }

    public static boolean checkName(Set<Order> set, String name) {
        return set.stream().anyMatch(order -> order.getUser().getLastName().equals(name));
    }

    public static Order getBiggestOrder(Set<Order> set) {
        return set.stream().findFirst().get();
    }

    public static Set<Order> deleteUsdOrders(Set<Order> set) {
        return set.stream().filter(order -> order.getCurrency() != Currency.USD).collect(Collectors.toSet());
    }
}
