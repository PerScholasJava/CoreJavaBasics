package perscholas.java_basics.generic_functional_interface;

import java.util.ArrayList;

@FunctionalInterface
public interface Calc<T, R> {
    R compute(T input);
}
