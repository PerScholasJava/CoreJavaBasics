package perscholas.java_basics.control_flow;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        exer1to3(7);
        exer1to3(15);
        exer4(15);
        exer4(5);
        exer5();
        exer6();
        exer7();
    }

    static void exer1to3(int x) {
        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x > 10 && x < 20) {
            System.out.println("Between 10 and 20");
        } else if (x >= 20) {
            System.out.println("Greater than or equal to 20");
        }
    }
    static void exer4(int x) {
        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        } else if (x > 10 && x < 20) {
            System.out.println("In range");
        }
    }
    static void exer5() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x < 0 || x > 100) {
            System.out.println("Score out of range");
        } else if (x >= 90) {
            System.out.println("A");
        } else if (x >= 80) {
            System.out.println("B");
        } else if (x >= 70) {
            System.out.println("C");
        } else if (x >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
    static void exer6() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x < 1 || x > 7) {
            System.out.println("Out of range");
        }

        switch (x) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
        }
    }
    static void exer7() {

        System.out.println("""
                Select filing status:
                1: Single
                2: Married filing jointly
                3: Married filing separately
                4: Head of household
                """);

        Scanner scanner = new Scanner(System.in);
        int status = scanner.nextInt();

        System.out.println("What is your income?");
        int income = scanner.nextInt();

        int taxRate = 0;

        switch (status) {
            case 1:
                taxRate = taxRateSingle(income);
                break;
            case 2:
                taxRate = taxRateMarriedFilingJointly(income);
                break;
            case 3:
                taxRate = taxRateMarriedFilingJSeparately(income);
                break;
            case 4:
                taxRate = taxRateHeadOfHousehold(income);
                break;
            default:
        }

        System.out.println("Your tax rate is " + taxRate + "%");
    }

    private static int taxRateSingle(int income) {
        int taxRate;
        if (income > 372950) {
            taxRate = 35;
        } else if (income > 171550) {
            taxRate = 33;
        } else if (income > 82250) {
            taxRate = 28;
        } else if (income > 33950) {
            taxRate = 25;
        } else if (income > 8350) {
            taxRate = 15;
        } else {
            taxRate = 10;
        }
        return taxRate;
    }
    private static int taxRateMarriedFilingJointly(int income) {
        int taxRate;
        if (income > 372950) {
            taxRate = 35;
        } else if (income > 208850) {
            taxRate = 33;
        } else if (income > 137050) {
            taxRate = 28;
        } else if (income > 67900) {
            taxRate = 25;
        } else if (income > 16700) {
            taxRate = 15;
        } else {
            taxRate = 10;
        }
        return taxRate;
    }

    private static int taxRateMarriedFilingJSeparately(int income) {
        int taxRate;
        if (income > 186475) {
            taxRate = 35;
        } else if (income > 104425) {
            taxRate = 33;
        } else if (income > 68525) {
            taxRate = 28;
        } else if (income > 33950) {
            taxRate = 25;
        } else if (income > 8350) {
            taxRate = 15;
        } else {
            taxRate = 10;
        }
        return taxRate;
    }

    private static int taxRateHeadOfHousehold(int income) {
        int taxRate;
        if (income > 372950) {
            taxRate = 35;
        } else if (income > 190200) {
            taxRate = 33;
        } else if (income > 117450) {
            taxRate = 28;
        } else if (income > 45500) {
            taxRate = 25;
        } else if (income > 11950) {
            taxRate = 15;
        } else {
            taxRate = 10;
        }
        return taxRate;
    }
}
