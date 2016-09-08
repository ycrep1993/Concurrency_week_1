package nl.mydigitalproject;

/**
 * Created by Ruben on 9/8/2016.
 */
public class SortUtils {

    public static void isSorted(int[] arr) {
        int last = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < last) {
                System.out.println("Something went wrong with the sorting!");
            }
        }
        System.out.println("Sorting successful!!");
    }

    public static int[] bubbleSort(int[] invoer) {
        int i, j, tijdelijk;
        for (j = 0; j < invoer.length; j++) {
            for (i = 1; i < invoer.length - j; i++) {
                if (invoer[i-1] > invoer[i]) {
                    tijdelijk = invoer[i];
                    invoer[i] = invoer[i-1];
                    invoer[i-1] = tijdelijk;
                }
            }
        }
        return invoer;
    }
}
