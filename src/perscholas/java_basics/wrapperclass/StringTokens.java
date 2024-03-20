package perscholas.java_basics.wrapperclass;

import java.io.*;
import java.util.*;

public class StringTokens {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         String s = scan.nextLine().trim();

         if (s.isEmpty()) {
             System.out.print(0);
         } else {
             String[] tokens = s.split("[^A-Za-z]+");

             System.out.println(tokens.length);

             for (String token:tokens) {
                 System.out.println(token);
             }
         }
         scan.close();
    }
}
