package nl.mydigitalproject;

/**
 * Created by Ruben on 9/8/2016.
 */
public class Opdracht2 {

    public void sort(int[] invoer) {

        int start = 0;
        int end = invoer.length - 1;

        long startTimer = System.currentTimeMillis();
        ThreadStarter bubble1 = new ThreadStarter(invoer, start, end/2);
        ThreadStarter bubble2 = new ThreadStarter(invoer, end/2+1, end);
        Thread thread1 = new Thread(bubble1);
        Thread thread2 = new Thread(bubble2);

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();

            assert SortUtils.isSorted(invoer, start, end/2) : "Eerste helft is niet gesorteerd";
            assert SortUtils.isSorted(invoer, end/2+1, end) : "Tweede helft is niet gesorteerd";

            invoer = SortUtils.merge(invoer);

            long elapsedTime = System.currentTimeMillis() - startTimer;
            System.out.println("Het sorteren duurde " + elapsedTime + "ms");

            assert SortUtils.isSorted(invoer) : "Array is niet gesorteerd";
        }catch (InterruptedException ie){
            System.out.println("It stopped");
        }
    }
}
