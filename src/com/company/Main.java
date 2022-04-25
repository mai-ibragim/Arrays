package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random ran = new Random();
        int[] arrays = new int[8];
        int sum = 0;
        int sum1 = 1;
        int count = 0;
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = ran.nextInt(1, 10);
            sum+=arrays[i];
            sum1*=arrays[i];
            count++;
            System.out.print(arrays[i] + " ");

        }
        System.out.println();
        System.out.println(sum);
        System.out.println(sum1);
    }
}



