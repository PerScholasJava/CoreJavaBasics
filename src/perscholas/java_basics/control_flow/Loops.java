package perscholas.java_basics.control_flow;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        
        multiplicationTable(12, 12);
        gcd();
        doubleTuition(10000, 0.07);
    }

    private static void multiplicationTable(int row, int col) {

        for (int i = 1; i < 12 + 1; i++) {
            for (int j = 1; j < col + 1; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.print("\n");
        }
    }

    private static void gcd() {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int gcd = Math.max(n1, n2);

        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                gcd = i;
            }
        }

        System.out.println("The GCD is " + gcd);
    }

    private static void doubleTuition(double tuition, double rateIncrease) {
        double newTuition = tuition;
        int year = 0;

        do {
            newTuition = newTuition * ( 1 + rateIncrease);
            year++;
        } while (newTuition < 2 * tuition);

        System.out.println("The tuition doubles in " + year + " years.");
    }
}
