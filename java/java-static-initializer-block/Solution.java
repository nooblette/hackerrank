// https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b;
        int h;
        
        b = scanner.nextInt();
        h = scanner.nextInt();
        
        if(b <= 0 || h <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(b * h);
        }
        scanner.close();
    }
}
