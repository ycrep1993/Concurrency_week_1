package nl.mydigitalproject;

import java.util.Random;

/**
 * Created by Ruben on 9/8/2016.
 */
public class SortUtils {

    /**
     * check if the entire array given is sorted
     * @param arr the array to check
     * @return true if the array is sorted, false otherwise
     */
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

    /**
     * check if a part of the array given is sorted
     * @param arr the array to check
     * @param start the starting point
     * @param end the ending point
     * @return true if the part is sorted, false otherwise
     */
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

    /**
     * fills an array with random numbers
     * @param arr the array to fill
     */
    public static void fillArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
    }

    /**
     * bubblesort an array
     * @param invoer the array to bubblesort
     */
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

    /**
     * bubblesort a part of an array
     * @param invoer the array to bubblesort
     * @param start the starting point
     * @param end the ending point
     */
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

    /**
     * mergesort a part of an array
     * @param invoer the array to mergesort
     * @param start the starting point
     * @param end the ending point
     */
    public static void merge(int[] invoer, int start, int end) {
        int[] result = new int[end - start + 1]; // make a new empty array the size of the total numbers in this particular part
        int counterLeftPart = start; // the starting point of the left side of the array-part
        int counterRightPart = start + ((end - start) / 2) + 1; // the starting point of the right side of the array-part
        int counterResult = 0;

        while (counterLeftPart < start + ((end - start) / 2) + 1 && counterRightPart < end + 1) {
            if (invoer[counterLeftPart] < invoer[counterRightPart]) { // if left is smaller than right, put left first
                result[counterResult++] = invoer[counterLeftPart++];
            } else { // else put right first
                result[counterResult++] = invoer[counterRightPart++];
            }
        }

        while (counterLeftPart < start + ((end - start) / 2) + 1) { // fill remaining numbers of the left side
            result[counterResult++] = invoer[counterLeftPart++];
        }

        while (counterRightPart < end + 1) { // fill remaining numbers of the right side
            result[counterResult++] = invoer[counterRightPart++];
        }

        // fill them into the original array
        int j = 0;
        for (int i = start; i < end; i++) {
            invoer[i] = result[j];
            j++;
        }
    }

    /**
     * mergesort an entire array that has 2 sorted halves
     * @param invoer the array to mergesort
     * @return a result array
     */
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
