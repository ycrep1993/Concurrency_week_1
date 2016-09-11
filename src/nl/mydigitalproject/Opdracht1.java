package nl.mydigitalproject;

/**
 * Created by Ruben on 9/8/2016.
 */
public class Opdracht1 {

    public void sort(int[] array1, int[] array2, int[] array3, int[] array4, int[] array5, int[] array6) {
        sort(array1);

        sort(array2);

        sort(array3);

        sort(array4);

        sort(array5);

        sort(array6);
    }

    public void sort(int[] array){
        long start = System.currentTimeMillis();
        SortUtils.bubbleSort(array);
        long elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Het sorteren duurde " + elapsedTime + "ms");
        assert SortUtils.isSorted(array) : "Array is niet gesorteerd";
    }
}
