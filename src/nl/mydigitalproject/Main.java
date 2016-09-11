package nl.mydigitalproject;

import java.util.Random;

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
        System.out.println("end");
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
        System.out.println("Opdracht 1:");
        Opdracht1 opdracht1 = new Opdracht1();
        for (int i = 0; i < 4; i++) {
            opdracht1.sort(array1);
            SortUtils.fillArray(array1);
        }

        System.out.println();
        System.out.println("Opdracht 2:");
        Opdracht2 opdracht2 = new Opdracht2();
        for (int i = 0; i < 4; i++) {
            opdracht2.sort(array1);
            SortUtils.fillArray(array1);
        }

        System.out.println();
        System.out.println("Opdracht 3:");
        Opdracht3 opdracht3 = new Opdracht3();
        for (int i = 0; i < 4; i++) {
            opdracht3.opdracht3(array1);
            SortUtils.fillArray(array1);
        }
    }

}
