package nl.mydigitalproject;

/**
 * Created by Ruben on 9/8/2016.
 */
public class Opdracht3 {

    public void opdracht3(int[] invoer) {
        long startTime = System.currentTimeMillis(); // save the current time
        int start = 0; // the first number of the array
        int end = invoer.length - 1; // the last number of the array

        // initialize new threads and run them
        RecursiveThreadStarter recursiveThreadStarter1 = new RecursiveThreadStarter(invoer, start, ((end / 2) + (start / 2)));
        RecursiveThreadStarter recursiveThreadStarter2 = new RecursiveThreadStarter(invoer, ((end / 2) + (start / 2)) + 1, end);
        Thread thread1 = new Thread(recursiveThreadStarter1);
        Thread thread2 = new Thread(recursiveThreadStarter2);

        thread1.start();
        thread2.start();

        try {
            // wait for the threads to complete their tasks
            thread1.join();
            thread2.join();

            // merge the last 2 remaining sorted lists together
            invoer = SortUtils.merge(invoer);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        // check if the final array is sorted
        assert SortUtils.isSorted(invoer) : "Array is niet gesorteerd";
        long elapsedTime = System.currentTimeMillis() - startTime; // calculated the elapsed time
        System.out.println("Het sorteren duurde " + elapsedTime + "ms");
    }
}
