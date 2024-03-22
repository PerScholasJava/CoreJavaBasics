package perscholas.java_basics.arrays;

public class Arrays {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
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
}
