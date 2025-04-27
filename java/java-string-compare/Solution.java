// https://www.hackerrank.com/challenges/java-string-compare/problem
import java.io.*;
import java.util.*;

public class  {
    public static String getSmallestAndLargest(String s, int k) {
        String max = s.substring(0, k);
        String min = s.substring(0, k);
        for(int i = 0; i <= s.length() - k; i++) {
            String subString = s.substring(i, i + k);
            max = max.compareTo(subString) > 0 ? max : subString;
            min = min.compareTo(subString) < 0 ? min : subString;
        }
        
        return min + "\n" + max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
