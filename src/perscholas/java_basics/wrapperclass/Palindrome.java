package perscholas.java_basics.wrapperclass;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        for (int i = 0; i < A.length() - 1; i++) {
            if (A.charAt(i) != A.charAt(A.length() - 1 - i)) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");

        sc.close();
    }
}
