package nl.mydigitalproject;

import java.util.Random;

/**
 * Created by Ruben on 9/8/2016.
 */
public class SortUtils {

    private static boolean busy = false;

    public static boolean isSorted(int[] arr) {
        int last = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < last) {
                return false;
            }
            last = arr[i];
        }
        return true;
    }

    public static boolean isSorted(int[] arr, int start, int end) {
        int last = arr[start];
        for (int i = start; i < end + 1; i++) {
            if (arr[i] < last) {
                System.out.println("culprit: " + i);
                return false;
            }
            last = arr[i];
        }
        return true;
    }

    public static void fillArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
    }

    public static void bubbleSort(int[] invoer) {
        int i, j, tijdelijk;
        for (j = 0; j < invoer.length; j++) {
            for (i = 1; i < invoer.length - j; i++) {
                if (invoer[i - 1] > invoer[i]) {
                    tijdelijk = invoer[i];
                    invoer[i] = invoer[i - 1];
                    invoer[i - 1] = tijdelijk;
                }
            }
        }
    }

    public static void bubbleSort(int[] invoer, int start, int end) {
        int i, j, tijdelijk;
        for (j = 0; j < end + 1; j++) {
            for (i = start + 1; i < (end + 1) - j; i++) {
                if (invoer[i - 1] > invoer[i]) {
                    tijdelijk = invoer[i];
                    invoer[i] = invoer[i - 1];
                    invoer[i - 1] = tijdelijk;
                }
            }
        }
    }

    public static void merge(int[] invoer, int start, int end) {
        while (busy) {
            System.out.println("busy");
        }
        //busy = true;
        int[] result = new int[end - start + 1];
        int counterLeftPart = start;
        int counterRightPart = start + ((end - start) / 2) + 1;
        int counterResult = 0;

        while (counterLeftPart < start + ((end - start) / 2) + 1 && counterRightPart < end + 1) {
            if (invoer[counterLeftPart] < invoer[counterRightPart]) {
                result[counterResult++] = invoer[counterLeftPart++];
            } else {
                result[counterResult++] = invoer[counterRightPart++];
            }
        }

        while (counterLeftPart < start + ((end - start) / 2) + 1) {
            result[counterResult++] = invoer[counterLeftPart++];
        }

        while (counterRightPart < end + 1) {
            result[counterResult++] = invoer[counterRightPart++];
        }

        if (result[result.length - 1] == 0) {
            System.out.println("last number is 0");
        }
        assert SortUtils.isSorted(result) : "Merge not sorted";
        int j = 0;
        for (int i = start; i < end; i++) {
            invoer[i] = result[j];
            j++;
        }
        busy = false;
    }

    public static int[] merge(int[] invoer) {

        int[] result = new int[invoer.length];

        int counterLeftPart = 0;
        int counterRightPart = invoer.length / 2;
        int counterResult = 0;

        while (counterLeftPart < invoer.length / 2 && counterRightPart < invoer.length) {
            if (invoer[counterLeftPart] < invoer[counterRightPart]) {
                result[counterResult++] = invoer[counterLeftPart++];
            } else {
                result[counterResult++] = invoer[counterRightPart++];
            }
        }

        while (counterLeftPart < invoer.length / 2) {
            result[counterResult++] = invoer[counterLeftPart++];
        }

        while (counterRightPart < invoer.length) {
            result[counterResult++] = invoer[counterRightPart++];
        }

        return result;
    }

}
