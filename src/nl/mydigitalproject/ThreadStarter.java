package nl.mydigitalproject;

/**
 * Created by Ruben on 9/8/2016.
 */
public class ThreadStarter implements Runnable {

    public ThreadStarter(int[] invoer) {
        bubbleSort(invoer);
    }

    @Override
    public void run() {

    }

    private int[] bubbleSort(int[] invoer) {
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

    private int[] merge(int[] invoer, int[] array1, int[] array2) {

        int counter1 = 0, counter2 = 0, resultCounter = 0;
        while (counter1 < array1.length && counter2 < array2.length){
            if (array1[counter1] < array2[counter2]){
                invoer[resultCounter++] = array1[counter1++];
            }else {
                invoer[resultCounter++] = array2[counter2++];
            }
        }

        while (counter1 < array1.length){
            invoer[resultCounter++] = array1[counter1++];
        }

        while (counter2 < array2.length){
            invoer[resultCounter++] = array2[counter2++];
        }

        return invoer;
    }
}