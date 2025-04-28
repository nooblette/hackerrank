// https://www.hackerrank.com/challenges/java-string-tokens/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        scanner.close();
        
        String[] tokens = s.split("[^A-Za-z]+");
        if(s.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(tokens.length);
            for(String token : tokens) {
                System.out.println(token);
            }
        }
    }
}
