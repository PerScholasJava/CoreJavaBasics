package perscholas.java_basics.generic_functional_interface;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEntry {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(
                "1: Add\n" +
                "2: Subtract\n" +
                "3: Multiply\n" +
                "4: Divide\n\n");

        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int limit = 10;

        switch (scanner.nextInt()) {
            case 1:
                result = c.add.compute(getInput(limit));
                break;
            case 2:
                result = c.subtract.compute(getInput(limit));
                break;
            case 3:
                result = c.multiply.compute(getInput(limit));
                break;
            case 4:
                result = c.divide.compute(getInput(2));
                break;
            default:
                break;
        }

        System.out.println(result);
    }

    static ArrayList<Integer> getInput(int limit) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (arrayList.size() < limit && scanner.hasNextInt()) {
            arrayList.add(scanner.nextInt());
        }
        scanner.close();

        return arrayList;
    }
}
