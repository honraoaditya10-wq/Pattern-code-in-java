/*
   *
  * *
 *   *
  * *
   *

 */

import java.util.*;
public class pattern7 {
    public static void main(String[] args) {
        int n = 3;

        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int s = i; s < n; s++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 1) {
                for (int sp = 1; sp <= 2 * i - 3; sp++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int s = n; s > i; s--) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 1) {
                for (int sp = 1; sp <= 2 * i - 3; sp++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
