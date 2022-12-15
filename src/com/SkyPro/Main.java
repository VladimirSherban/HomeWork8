package com.SkyPro;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("\nЗадача_1");
        int[] spring = new int[3];
        spring[0] = 1;
        spring[1] = 2;
        spring[2] = 3;
        double[] index = {1.57, 1.654, 9.986};
        int[] id = {12, 444, 234, 222, 20022, 4};

        System.out.println(Arrays.toString(spring));
        System.out.println(Arrays.toString(index));
        System.out.println(Arrays.toString(id));

        for (int i = spring.length - 1; i >= 0; i--) {
            System.out.print(spring[i] + ", ");
        }
        System.out.println();
        for (int i = index.length - 1; i >= 0; i--) {
            System.out.print(index[i] + ", ");
        }
        System.out.println();
        for (int i = id.length - 1; i >= 0; i--) {
            System.out.print(id[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < spring.length; i++) {
            if (spring[i] % 3 == 1 || spring[i] == 1) {
                spring[i] = spring[i] + 1;
            }
            System.out.print(spring[i] + ", ");

        }

    }

    public static void task2() {

        System.out.println("\nЗадача_2");
    }

    public static void task3() {

        System.out.println("\nЗадача_3");
    }

    public static void task4() {

        System.out.println("\nЗадача_4");
    }
}

