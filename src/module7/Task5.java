package module7;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        final int THOUSAND = 1000;
        final int TENTHOUSAND = 10000;
        List<Integer> integerArrayList = new ArrayList<>();
        List<String> stringArrayList = new ArrayList<>();
        List<Integer> integerLinkedList = new LinkedList<>();
        List<String> stringLinkedList = new LinkedList<>();
        Random randomInt = new Random();

        long start = System.currentTimeMillis();
        for (int i = 0; i < THOUSAND; i++) {
            integerArrayList.add(randomInt.nextInt());
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts ADD operation in integer ArrayList with 1000 Elements");

        start = System.currentTimeMillis();
        for (int i = 0; i < THOUSAND; i++) {
            integerLinkedList.add(randomInt.nextInt());
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts ADD operation in integer LinkedList with 1000 Elements");

        start = System.currentTimeMillis();
        for (int i = 0; i < THOUSAND; i++) {
            stringArrayList.add("random string");
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts ADD operation in string ArrayList with 1000 Elements");

        start = System.currentTimeMillis();
        for (int i = 0; i < THOUSAND; i++) {
            stringLinkedList.add("random string");
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts ADD operation in string LinkedList with 1000 Elements");

        start = System.currentTimeMillis();
        for (int i = 0; i < THOUSAND; i++) {
            integerArrayList.set(i, randomInt.nextInt());
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts SET operation in integer ArrayList with 1000 Elements");

        start = System.currentTimeMillis();
        for (int i = 0; i < THOUSAND; i++) {
            integerLinkedList.set(i, randomInt.nextInt());
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts SET operation in integer LinkedList with 1000 Elements");

        start = System.currentTimeMillis();
        for (int i = 0; i < THOUSAND; i++) {
            stringArrayList.set(i, "another random string");
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts SET operation in string ArrayList with 1000 Elements");

        start = System.currentTimeMillis();
        for (int i = 0; i < THOUSAND; i++) {
            stringLinkedList.set(i, "another random string");
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts SET operation in string LinkedList with 1000 Elements");

        start = System.currentTimeMillis();
        for (int i = 0; i < THOUSAND; i++) {
            integerArrayList.get(i);
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts GET operation in integer ArrayList with 1000 Elements");

        start = System.currentTimeMillis();
        for (int i = 0; i < THOUSAND; i++) {
            integerLinkedList.get(i);
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts GET operation in integer LinkedList with 1000 Elements");

        start = System.currentTimeMillis();
        for (int i = 0; i < THOUSAND; i++) {
            stringArrayList.get(i);
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts GET operation in string ArrayList with 1000 Elements");

        start = System.currentTimeMillis();
        for (int i = 0; i < THOUSAND; i++) {
            stringLinkedList.get(i);
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts GET operation in string LinkedList with 1000 Elements");

        start = System.currentTimeMillis();
        for (Iterator<Integer> it = integerArrayList.listIterator(); it.hasNext(); ) {
            it.next();
            it.remove();
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts REMOVE operation in integer ArrayList with 1000 Elements");

        start = System.currentTimeMillis();
        for (Iterator<Integer> it = integerLinkedList.listIterator(); it.hasNext(); ) {
            it.next();
            it.remove();
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts REMOVE operation in integer LinkedList with 1000 Elements");

        start = System.currentTimeMillis();
        for (Iterator<String> it = stringArrayList.listIterator(); it.hasNext(); ) {
            it.next();
            it.remove();
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts REMOVE operation in string ArrayList with 1000 Elements");

        start = System.currentTimeMillis();
        for (Iterator<String> it = stringLinkedList.listIterator(); it.hasNext(); ) {
            it.next();
            it.remove();
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts REMOVE operation in string LinkedList with 1000 Elements");

//      -----------------------------------------

        start = System.currentTimeMillis();
        for (int i = 0; i < TENTHOUSAND; i++) {
            integerArrayList.add(randomInt.nextInt());
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts ADD operation in integer ArrayList with 10000 Elements");

        start = System.currentTimeMillis();
        for (int i = 0; i < TENTHOUSAND; i++) {
            integerLinkedList.add(randomInt.nextInt());
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts ADD operation in integer LinkedList with 10000 Elements");

        start = System.currentTimeMillis();
        for (int i = 0; i < TENTHOUSAND; i++) {
            stringArrayList.add("random string");
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts ADD operation in string ArrayList with 10000 Elements");

        start = System.currentTimeMillis();
        for (int i = 0; i < TENTHOUSAND; i++) {
            stringLinkedList.add("random string");
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts ADD operation in string LinkedList with 10000 Elements");

        start = System.currentTimeMillis();
        for (int i = 0; i < TENTHOUSAND; i++) {
            integerArrayList.set(i, randomInt.nextInt());
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts SET operation in integer ArrayList with 10000 Elements");

        start = System.currentTimeMillis();
        for (int i = 0; i < TENTHOUSAND; i++) {
            integerLinkedList.set(i, randomInt.nextInt());
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts SET operation in integer LinkedList with 10000 Elements");

        start = System.currentTimeMillis();
        for (int i = 0; i < TENTHOUSAND; i++) {
            stringArrayList.set(i, "another random string");
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts SET operation in string ArrayList with 10000 Elements");

        start = System.currentTimeMillis();
        for (int i = 0; i < TENTHOUSAND; i++) {
            stringLinkedList.set(i, "another random string");
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts SET operation in string LinkedList with 10000 Elements");

        start = System.currentTimeMillis();
        for (int i = 0; i < TENTHOUSAND; i++) {
            integerArrayList.get(i);
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts GET operation in integer ArrayList with 10000 Elements");

        start = System.currentTimeMillis();
        for (int i = 0; i < TENTHOUSAND; i++) {
            integerLinkedList.get(i);
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts GET operation in integer LinkedList with 10000 Elements");

        start = System.currentTimeMillis();
        for (int i = 0; i < TENTHOUSAND; i++) {
            stringArrayList.get(i);
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts GET operation in string ArrayList with 10000 Elements");

        start = System.currentTimeMillis();
        for (int i = 0; i < TENTHOUSAND; i++) {
            stringLinkedList.get(i);
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts GET operation in string LinkedList with 10000 Elements");

        start = System.currentTimeMillis();
        for (Iterator<Integer> it = integerArrayList.listIterator(); it.hasNext(); ) {
            it.next();
            it.remove();
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts REMOVE operation in integer ArrayList with 10000 Elements");

        start = System.currentTimeMillis();
        for (Iterator<Integer> it = integerLinkedList.listIterator(); it.hasNext(); ) {
            it.next();
            it.remove();
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts REMOVE operation in integer LinkedList with 10000 Elements");

        start = System.currentTimeMillis();
        for (Iterator<String> it = stringArrayList.listIterator(); it.hasNext(); ) {
            it.next();
            it.remove();
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts REMOVE operation in string ArrayList with 10000 Elements");

        start = System.currentTimeMillis();
        for (Iterator<String> it = stringLinkedList.listIterator(); it.hasNext(); ) {
            it.next();
            it.remove();
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms lasts REMOVE operation in string LinkedList with 10000 Elements");
    }
}
