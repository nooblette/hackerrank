# https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        test(N);
    }
    
    private static void test(int n) {
        if(n % 2 != 0) {
            System.out.println("Weird");
            return;
        }
        
        if(n > 20) {
            System.out.println("Not Weird");
            return;
        }
        
        if(n >= 6) {
            System.out.println("Weird");
            return;
        }
        
        if(n >= 2) {
            System.out.println("Not Weird");
            return;
        }
    }
}
