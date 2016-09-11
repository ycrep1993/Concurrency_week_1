package nl.mydigitalproject;

/**
 * Created by Ruben on 9/8/2016.
 */
public class Opdracht1 {

    public void sort(int[] array){
        long start = System.currentTimeMillis();
        SortUtils.bubbleSort(array);
        long elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Het sorteren duurde " + elapsedTime + "ms");
        assert SortUtils.isSorted(array) : "Array is niet gesorteerd";
    }
}
