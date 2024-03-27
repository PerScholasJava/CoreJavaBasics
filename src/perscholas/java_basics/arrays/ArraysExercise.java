package perscholas.java_basics.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercise {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
    }

    private static void task1() {
        int[] arr = {1, 2, 3};

        for (int el : arr) {
            System.out.println(el);
        }
    }

    private static void task2() {
        int[] arr = {13, 5, 7, 68, 2};

        System.out.println(arr[(arr.length - 1) / 2]);
    }

    private static void task3() {
        String[] str = {"red", "green", "blue", "yellow"};

        System.out.println(str.length);

        String[] strClone = str.clone();

        System.out.println(java.util.Arrays.toString(strClone));
    }
    private static void task4() {
        int[] arr = {13, 5, 7, 68, 2, 100};

        System.out.println(arr[0]);
        System.out.println(arr[arr.length - 1]);
//        System.out.println(arr[arr.length]);
    }

    private static void task5() {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }
    }

    private static void task6() {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
            System.out.println(arr[i]);
        }
    }

    private static void task7() {
        int[] arr = {13, 5, 7, 68, 2};

        for (int i = 0; i < arr.length; i++) {
            if (!(i == ((arr.length - 1) / 2))) {
                System.out.println(arr[i]);
            }
        }
    }

    private static void task8() {
        int[] arr = {13, 5, 7, 68, 2};
        int temp = arr[0];
        int midIdx = (arr.length - 1) / 2;

        arr[0] = arr[midIdx];
        arr[midIdx] = temp;

        for (int el : arr) {
            System.out.println(el);
        }
    }

    private static void task9() {
        int[] arr = {4, 2, 9, 13, 1, 0};

        Arrays.sort(arr);

        System.out.print("Array in ascending order: ");

        for (int el : arr) {
            System.out.print(el + " ");
        }

        System.out.print("\nThe smallest number is " + arr[0]);

        System.out.println("\nThe biggest number is " + arr[arr.length - 1]);
    }

    private static void task10() {
//        int[] arr = {13, 5, 7, "A string", "Another string", "More string", 2.0};

        // An array cannot hold values of different data types.
    }

    private static void task11() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many favorite things do you have?");
        int num = scanner.nextInt();

        String[] arr = new String[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter your thing: ");
            arr[i] = scanner.next();
        }

        System.out.println("Your favorite things are:");

        for (String el : arr) {
            System.out.print(el + " ");
        }
    }
}
