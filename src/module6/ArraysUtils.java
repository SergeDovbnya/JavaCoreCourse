package module6;

public final class ArraysUtils {
    public static int sum(int array[]) {
        int sumResult = 0;
        for (int item: array) {
            sumResult += item;
        }
        return sumResult;
    }

    public static int min(int array[]) {
        int minValue = array[0];
        for (int item: array) {
            if (minValue > item) minValue = item;
        }
        return minValue;
    }

    public static int max(int array[]) {
        int maxValue = array[0];
        for (int item: array) {
            if (item > maxValue) maxValue = item;
        }
        return maxValue;
    }

    public static int maxPositive(int array[]) {
        int maxPositiveValue = 0;

        for (int item: array) {
            if (item > 0 && item > maxPositiveValue) {
                maxPositiveValue = item;
            }
        }
        return maxPositiveValue;
    }

    public static long multiplication(int array[]) {
        long multiplyResult = 1;
        for (int item: array) {
            multiplyResult *= item;
        }
        return multiplyResult;
    }

    public static int modulus(int array[]) {
        return array[array.length - 1]%array[0];
    }

    public static int secondLargest(int array[]) {
        int largestValue = Integer.MIN_VALUE;
        int secondLargestValue = Integer.MIN_VALUE;
        for (int item : array) {
            if (item > largestValue) {
                secondLargestValue = largestValue;
                largestValue = item;
            } else if (item > secondLargestValue && item != largestValue) {
                secondLargestValue = item;
            }
        }
        return secondLargestValue;
    }

    public static int[] reverse(int[] array) {
        int[] resultArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            resultArray[array.length - 1 - i] = array[i];
        }
        return resultArray;
    }

    public static int[] findEvenElements(int[] array) {
        int[] resultArray = new int[array.length];
        int index = 0;
        for (int item: array) {
            if (item%2 == 0) {
                resultArray[index] = item;
                index++;
            }
        }
        return resultArray;
    }

}
