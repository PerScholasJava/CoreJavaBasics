package perscholas.java_basics.wrapperclass;

import java.util.Scanner;
import java.util.StringJoiner;

public class strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int lengthSum = A.length() + B.length();
        System.out.println(lengthSum);

        System.out.println(A.compareTo(B) > 1 ? "Yes" : "No");

        StringJoiner combined = new StringJoiner(" ");
        combined.add(A.substring(0, 1).toUpperCase() + A.substring(1));
        combined.add(B.substring(0, 1).toUpperCase() + B.substring(1));
        System.out.println(combined);

        sc.close();
    }
}
