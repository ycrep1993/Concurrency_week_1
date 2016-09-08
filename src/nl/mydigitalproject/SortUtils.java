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

    public static int[] merge(int[] invoer) {

        int[] result = new int[invoer.length];

        int counterLeftPart = 0;
        int counterRightPart = (invoer.length/2) + 1;
        int counterResult = 0;

        while (counterLeftPart < invoer.length/2 && counterRightPart < invoer.length){
            if (invoer[counterLeftPart] < invoer[counterRightPart]){
                result[counterResult++] = invoer[counterLeftPart++];
            } else{
                result[counterResult++] = invoer[counterRightPart++];
            }
        }

        while(counterLeftPart < invoer.length/2){
            result[counterResult++] = invoer[counterLeftPart++];
        }

        while(counterRightPart < invoer.length){
            result[counterResult++] = invoer[counterRightPart++];
        }

        return result;

//        int counter1 = 0, counter2 = 0, resultCounter = 0;
//        while (counter1 < array1.length && counter2 < array2.length){
//            if (array1[counter1] < array2[counter2]){
//                invoer[resultCounter++] = array1[counter1++];
//            }else {
//                invoer[resultCounter++] = array2[counter2++];
//            }
//        }
//
//        while (counter1 < array1.length){
//            invoer[resultCounter++] = array1[counter1++];
//        }
//
//        while (counter2 < array2.length){
//            invoer[resultCounter++] = array2[counter2++];
//        }

        //return invoer;
    }
}
