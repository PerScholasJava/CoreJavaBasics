package perscholas.java_basics.generic_functional_interface;

import java.util.ArrayList;

public class Calculator {
    Calc<ArrayList<Integer>, Integer> add = new Calc<ArrayList<Integer>, Integer>() {
        @Override
        public Integer compute(ArrayList<Integer> input) {
            int sum = 0;
            for (Integer n : input) {
                sum += n;
            }
            return sum;
        }
    };

    Calc<ArrayList<Integer>, Integer> subtract = new Calc<ArrayList<Integer>, Integer>() {
        @Override
        public Integer compute(ArrayList<Integer> input) {
            int difference = input.getFirst();

            for (int i = 1; i < input.size(); i++ ) {
                difference -= input.get(i);
            }
            return difference;
        }
    };

    Calc<ArrayList<Integer>, Integer> multiply = new Calc<ArrayList<Integer>, Integer>() {
        @Override
        public Integer compute(ArrayList<Integer> input) {
            int product = 1;

            for (int i = 0; i < input.size(); i++ ) {
                product *= input.get(i);
            }
            return product;
        }
    };

    Calc<ArrayList<Integer>, Integer> divide = new Calc<ArrayList<Integer>, Integer>() {

        @Override
        public Integer compute(ArrayList<Integer> input) {
            return input.getFirst() / input.getLast();
        }
    };
}
