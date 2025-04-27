// https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println("================================");
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String first = scanner.next();
            int second = scanner.nextInt();
            int n = first.length();
            System.out.printf("%s%" + (15-n) + "s%03d\n", first, "", second);
        }
        scanner.close();
        System.out.println("================================");
    }
}
