package perscholas.java_basics.functional_programming;

import java.util.ArrayList;

@FunctionalInterface
public interface Calc {
    int compute(ArrayList<Integer> input);
}
