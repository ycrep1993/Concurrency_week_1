package nl.mydigitalproject;

/**
 * Created by Ruben on 9/1/2016.
 */
public class Sort {



    /*public int[] twoThreadBubbleSort(int[] invoer) {

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

            merge(invoer, array1, array2);
        }catch (InterruptedException ie){
            System.out.println("It stopped");
        }

        long elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Het sorteren duurde " + elapsedTime + "ms");

        return finalResult;
    }*/

}
