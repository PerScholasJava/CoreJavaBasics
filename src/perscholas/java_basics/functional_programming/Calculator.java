package perscholas.java_basics.functional_programming;

import java.util.ArrayList;

public class Calculator {
    Calc add = new Calc() {
        @Override
        public int compute(ArrayList<Integer> input) {
            int sum = 0;
            for (Integer n : input) {
                sum += n;
            }
            return sum;
        }
    };

    Calc subtract = new Calc() {
        @Override
        public int compute(ArrayList<Integer> input) {
            int difference = input.getFirst();

            for (int i = 1; i < input.size(); i++ ) {
                difference -= input.get(i);
            }
            return difference;
        }
    };

    Calc multiply = new Calc() {
        @Override
        public int compute(ArrayList<Integer> input) {
            int product = 1;

            for (int i = 0; i < input.size(); i++ ) {
                product *= input.get(i);
            }
            return product;
        }
    };

    Calc divide = new Calc() {
        @Override
        public int compute(ArrayList<Integer> input) {
            return input.getFirst() / input.getLast();
        }
    };
}
