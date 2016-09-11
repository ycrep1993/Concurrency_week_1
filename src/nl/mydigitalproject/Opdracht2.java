package nl.mydigitalproject;

/**
 * Created by Ruben on 9/8/2016.
 */
public class Opdracht2 {

    public void sort(int[] invoer) {

        int start = 0; // the first number of the array
        int end = invoer.length - 1; // the last number of the array

        long startTimer = System.currentTimeMillis(); // save the current time

        // initialize new threads and run them
        ThreadStarter bubble1 = new ThreadStarter(invoer, start, end / 2);
        ThreadStarter bubble2 = new ThreadStarter(invoer, end / 2 + 1, end);
        Thread thread1 = new Thread(bubble1);
        Thread thread2 = new Thread(bubble2);

        thread1.start();
        thread2.start();

        try {
            // wait for the threads to complete their tasks
            thread1.join();
            thread2.join();

            // check if the halves are sorted
            assert SortUtils.isSorted(invoer, start, end / 2) : "Eerste helft is niet gesorteerd";
            assert SortUtils.isSorted(invoer, end / 2 + 1, end) : "Tweede helft is niet gesorteerd";

            // merge the 2 sorted lists together
            invoer = SortUtils.merge(invoer);

            long elapsedTime = System.currentTimeMillis() - startTimer; // calculate time passed
            System.out.println("Het sorteren duurde " + elapsedTime + "ms");

            // check if the entire list is sorted
            assert SortUtils.isSorted(invoer) : "Array is niet gesorteerd";
        } catch (InterruptedException ie) {
            System.out.println("The thread was interrupted.");
        }
    }
}
