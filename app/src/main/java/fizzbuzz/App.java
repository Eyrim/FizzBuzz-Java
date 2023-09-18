/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package fizzbuzz;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void fizzbuzz() {
        int cap = 100;
        StringBuilder sb = new StringBuilder();

        // Iterate through numbers 1 -> 100
        for (int i = 1; i <= cap; i++) {

            // if i is divisible by 7 and NOT 3 or 5
            if (isDivBy(i, 7) && !(isDivBy(i, 3) || isDivBy(i, 5))) {
                sb.append("BANG");
            }
            //if i is divisible by 7 and 3 OR 5 [7 AND(OR(3, 5))]
            else if (isDivBy(i, 7) && (isDivBy(i, 3) || isDivBy(i, 5))) {
                sb.append("FIZZBANG");
            }
            // if i is only divisible by 3 and not 5
            else if (isDivBy(i, 3) && !isDivBy(i, 5)) {
                sb.append("FIZZ");
            }
            // if i is only divisible by 5 and not 3
            else if (!isDivBy(i, 3) && isDivBy(i, 5)) {
                sb.append("BUZZ");
            }
            // if i is divisible by both
            else if (isDivBy(i, 3)) {
                sb.append("FIZZ BUZZ");
            }
            else {
                sb.append(i);
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }

    private static boolean isDivBy(int left, int right) {
        return left % right == 0;
    }

    public static ArrayList<Integer> getDivisorsList(int num) {
        int squareRoot = (int) Math.sqrt(num);
        ArrayList<Integer> divisorList = new ArrayList<>();
        divisorList.add(1);

        for (int i = 2; i <= squareRoot; i++) {
            if (num % i == 0) {
                divisorList.add(i);
            }
        }

        return divisorList;
    }

    public static void main(String[] args) {
//        getDivisorsList(12);
        fizzbuzz();
    }
}
