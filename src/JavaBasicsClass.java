public class JavaBasicsClass {
    public static void main(String[] args) {
        int intNum1 = 5;
        int intNum2 = 10;
        double doubleNum1 = 5.0;
        double doubleNum2 = 10.0;

        // Exercise 1:
        int intSum = intNum1 + intNum2;
        System.out.println("Integer sum: " + intSum);

        // Exercise 2:
        double doubleSum = doubleNum1 + doubleNum2;
        System.out.println("Double sum: " + doubleSum);

        // Exercise 3:
        double intDoubleSum = intNum1 + doubleNum1;
        System.out.println("Int and double sum: " + intDoubleSum);

        // Exercise 4a:
        int intQuotient = intNum2 / intNum1;
        System.out.println("Integer quotient: " + intQuotient);

        // Exercise 4b:
        double doubleAndIntQuotient = doubleNum2 / intNum1;
        System.out.println("Double and integer quotient: " + doubleAndIntQuotient);

        // Exercise 5a:
        double doubleQuotient = doubleNum2 / doubleNum1;
        System.out.println("Double quotient: " + doubleQuotient);

        // Exercise 5b:
        int doubleQuotientCastToInt = (int) doubleQuotient;
        System.out.println("Double quotient casted to int: " + doubleQuotientCastToInt);

        // Exercise 6a:
        int x = 5;
        int y = 6;
        double q = (double) (y / x);

        System.out.println("y/x: " + q);

        // Exercise 6b:
        q = (double) y;
        System.out.println("Cast y to a double: " + q);

        // Exercise 7:
        final int CONST_VALUE = 100;
        System.out.println("Using constant int: " + (CONST_VALUE + intNum1));

        // Exercise 8:
        double cappuccino = 5.49;
        double espresso = 2.99;
        double greenTea = 4.99;
        double subtotal;
        double totalSale;
        final double SALES_TAX = 0.12;

        subtotal = (3 * cappuccino) + (4 * espresso) + (2 * greenTea);
        totalSale = subtotal + (subtotal * SALES_TAX);
        System.out.printf("Total sale: %.2f", totalSale);
    }
}