package nl.mydigitalproject;

/**
 * Created by Ruben on 9/1/2016.
 */
public class Sort {

    public int[] bubbleSort(int[] invoer) {
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

    public int[] twoThreadBubbleSort(int[] invoer){

        int[] array1 = new int[invoer.length/2];
        int[] array2 = new int[invoer.length/2];

        int[] result1 = new int[invoer.length/2];
        int[] result2 = new int[invoer.length/2];
        int[] finalResult = new int[invoer.length];

        System.arraycopy(invoer, 0, array1, 0, invoer.length/2);
        System.arraycopy(invoer, invoer.length/2, array2, 0, invoer.length/2);

        Thread bubble1 = new Thread(new Runnable() {
            @Override
            public void run() {

                int[] sorted = bubbleSort(array1);
                System.arraycopy(sorted, 0, result1, 0, sorted.length);
            }
        });

        Thread bubble2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int[] sorted = bubbleSort(array2);
                System.arraycopy(sorted, 0, result2, 0, sorted.length);
            }
        });

        long start = System.currentTimeMillis();
        bubble1.start();
        bubble2.start();

        try{
            bubble1.join();
            bubble2.join();

            int counter1 = 0, counter2 = 0, resultCounter = 0;
            while (counter1 < array1.length && counter2 < array2.length){
                if (array1[counter1] < array2[counter2]){
                    finalResult[resultCounter++] = array1[counter1++];
                }else {
                    finalResult[resultCounter++] = array2[counter2++];
                }
            }

            while (counter1 < array1.length){
                finalResult[resultCounter++] = array1[counter1++];
            }

            while (counter2 < array2.length){
                finalResult[resultCounter++] = array2[counter2++];
            }
        }catch (InterruptedException ie){
            System.out.println("It stopped");
        }

        long elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Het sorteren duurde " + elapsedTime + "ms");

        return finalResult;
    }
}
