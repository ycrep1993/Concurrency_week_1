package nl.mydigitalproject;

import java.util.ArrayList;

public class Main {

    //Arrays to be sorted
    private int[] array1;
    private int[] array2;
    private int[] array3;
    private int[] array4;
    private int[] array5;
    private int[] array6;


    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        //init arrays
        array1 = new int[25000];
        array2 = new int[50000];
        array3 = new int[100000];
        array4 = new int[200000];
        array5 = new int[400000];
        array6 = new int[800000];

        //fill arrays
        SortUtils.fillArray(array1);
        SortUtils.fillArray(array2);
        SortUtils.fillArray(array3);
        SortUtils.fillArray(array4);
        SortUtils.fillArray(array5);
        SortUtils.fillArray(array6);

        System.out.println("Arrays are filled!");
        System.out.println();
        ArrayList<int[]> arrs = new ArrayList<>();
        arrs.add(array1);
        arrs.add(array2);
        arrs.add(array3);
        arrs.add(array4);
        arrs.add(array5);
        arrs.add(array6);
        int j = 1;
        for (int[] arr : arrs) {
            System.out.println("array " + j);
            // execute Opdracht 1 4 times.
            System.out.println("-Opdracht 1:");
            Opdracht1 opdracht1 = new Opdracht1();
            for (int i = 0; i < 4; i++) {
                //opdracht1.sort(arr);
                SortUtils.fillArray(arr); // re-randomize the array
            }

            // execute Opdracht 2 4 times.
            System.out.println();
            System.out.println("-Opdracht 2:");
            Opdracht2 opdracht2 = new Opdracht2();
            for (int i = 0; i < 4; i++) {
                opdracht2.sort(arr);
                SortUtils.fillArray(arr); // re-randomize the array
            }

            // execute Opdracht 3 4 times.
            System.out.println();
            System.out.println("-Opdracht 3:");
            Opdracht3 opdracht3 = new Opdracht3();
            for (int i = 0; i < 4; i++) {
                opdracht3.opdracht3(arr);
                SortUtils.fillArray(arr); // re-randomize the array
            }
            System.out.println();
            j++;
        }
    }

}
