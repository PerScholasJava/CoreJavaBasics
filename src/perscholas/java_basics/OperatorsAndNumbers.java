package perscholas.java_basics;

import java.util.SortedMap;

public class OperatorsAndNumbers {

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    static void task1() {
        int x = 2;
        System.out.println(Integer.toBinaryString(x));

        x = x << 1;
        // 0010
        // Expected decimal value: 4
        System.out.println(x);
        // Expected binary value: 100
        System.out.println(Integer.toBinaryString(x));

        x = 9;
        // 0000 1001
        x = x << 1;
        // 0001 0010
        // Expected decimal value: 18
        System.out.println(x);
        // Expected binary value: 0001 0010
        System.out.println(Integer.toBinaryString(x));

        x = 17;
        // 0001 0001
        x = x << 1;
        // 0010 0010
        // Expected decimal value: 34
        System.out.println(x);
        // Expected binary value: 0010 0010
        System.out.println(Integer.toBinaryString(x));

        x = 88;
        // 0101 1000
        x = x << 1;
        // 1011 0000
        // Expected decimal value: 176
        System.out.println(x);
        // Expected binary value: 1011 0000
        System.out.println(Integer.toBinaryString(x));
    }

    static void task2() {
        int x = 150;
        // 1001 0110
        System.out.println(Integer.toBinaryString(x));

        x = x >> 2;
        // 0010 0101
        // Expected decimal value: 37
        System.out.println(x);
        // Expected binary value: 0010 0101
        System.out.println(Integer.toBinaryString(x));

        x = 225;
        x = x >> 2;
        // 0011 1000
        // Expected decimal value: 56
        System.out.println(x);
        // Expected binary value: 0011 1000
        System.out.println(Integer.toBinaryString(x));

        x = 1555;
        // 0110 0001 0011
        x = x >> 2;
        // 0001 1000 0100
        // Expected decimal value: 388
        System.out.println(x);
        // Expected binary value: 0001 1000 0100
        System.out.println(Integer.toBinaryString(x));

        x = 32456;
        // 0111 1110 1100 1000
        x = x >> 2;
        // 0001 1111 1011 0010
        // Expected decimal value: 8114
        System.out.println(x);
        // Expected binary value: 0001 1111 1011 0010
        System.out.println(Integer.toBinaryString(x));
    }

    static void task3() {
        int x, y, z;
        x = 7;  // 0000 0111
        y = 17; // 0001 0001

        z = x & y;
        // 0000 0001
        // Expected decimal value: 1
        System.out.println(z);
        // Expected binary value: 0000 0001
        System.out.println(Integer.toBinaryString(z));
    }

    static void task4() {
        int x, y, z;
        x = 7;  // 0000 0111
        y = 17; // 0001 0001

        z = x | y;
        // 0001 0111
        // Expected decimal value: 23
        System.out.println(z);
        // Expected binary value: 0001 0111
        System.out.println(Integer.toBinaryString(z));
    }

    static void task5() {
        int x = 23;
        System.out.println(x);   // 23

        System.out.println(x++); // 23
    }

    static void task6() {
        int x = 100;

        x = x + 1;
        System.out.println(x); // 101

        x++;
        System.out.println(x); // 102

        x +=1;
        System.out.println(x); // 103
    }

    static void task7() {
        int x = 5;
        int y = 8;
        int sum1 = ++x + y;   // Increment x then calculate the sum
        System.out.println(sum1); // 14

        x = 5;
        y = 8;
        int sum2 = x++ + y;   // Calculate the sum then increment x
        System.out.println(sum2); // 13
    }
}
