package module2;

public class Task1 {

    static int sum(int array[]) {
        int sumResult = 0;
        for (int item: array) {
            sumResult += item;
        }
//        sumResult = IntStream.of(array).sum();
        return sumResult;
    }

    static double sum(double array[]) {
        double sumResult = 0;
        for (double item: array) {
            sumResult += item;
        }
        return sumResult;
    }

    static int min(int array[]) {
        int minValue = array[0];
        for (int item: array) {
            if (minValue > item) minValue = item;
        }
        return minValue;
    }

    static double min(double array[]) {
        double minValue = array[0];
        for (double item: array) {
            if (item < minValue) minValue = item;
        }
        return minValue;
    }

    static int max(int array[]) {
        int maxValue = array[0];
        for (int item: array) {
            if (item > maxValue) maxValue = item;
        }
        return maxValue;
    }

    static double max(double array[]) {
        double maxValue = array[0];
        for (double item: array) {
            if (item > maxValue) maxValue = item;
        }
        return maxValue;
    }

    static int maxPositive(int array[]) {
        int maxPositiveValue = 0;

        for (int item: array) {
            if (item > 0 && item > maxPositiveValue) {
                maxPositiveValue = item;
            }
        }
        return maxPositiveValue;
    }

    static double maxPositive(double array[]) {
        double maxPositiveValue = 0;

        for (double item: array) {
            if (item > 0 && item > maxPositiveValue) {
                maxPositiveValue = item;
            }
        }
        return maxPositiveValue;
    }

    static long multiplication(int array[]) {
        long multiplyResult = 1;
        for (int item: array) {
            multiplyResult *= item;
        }
        return multiplyResult;
    }

    static double multiplication(double array[]) {
        double multiplyResult = 1;
        for (double item: array) {
            multiplyResult *= item;
        }
        return multiplyResult;
    }

    static int modulus(int array[]) {
        return array[array.length - 1]%array[0];
    }

    static double modulus(double array[]) {
        return array[array.length - 1]%array[0];
    }

    static int secondLargest(int array[]) {
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

    static double secondLargest(double array[]) {
        double largestValue = Double.MIN_VALUE;
        double secondLargestValue = Double.MIN_VALUE;
        for (double item : array) {
            if (item > largestValue) {
                secondLargestValue = largestValue;
                largestValue = item;
            } else if (item > secondLargestValue && item != largestValue) {
                secondLargestValue = item;
            }
        }
        return secondLargestValue;
    }


    public static void main(String[] args) {
        int[] arrayOfInt = {2, 10, 65, 31, 10, -5, 17, 98, -30, 35};
        double[] arrayOfDouble = {2.1, 3.15, 7.99, 8, -3.333, 15.35, -20.001, 10, 99.99, 61.69};

        System.out.println("Sum " + sum(arrayOfInt) + " " + sum(arrayOfDouble));
        System.out.println("Min " + min(arrayOfInt) + " " + min(arrayOfDouble));
        System.out.println("Max " + max(arrayOfInt) + " " + max(arrayOfDouble));
        System.out.println("MaxPositive " + maxPositive(arrayOfInt) + " " + maxPositive(arrayOfDouble));
        System.out.println("Multiply " + multiplication(arrayOfInt) + " " + multiplication(arrayOfDouble));
        System.out.println("Modulus " + modulus(arrayOfInt) + " " + modulus(arrayOfDouble));
        System.out.println("Secound Largest " + secondLargest(arrayOfInt) + " " + secondLargest(arrayOfDouble));
    }
}
