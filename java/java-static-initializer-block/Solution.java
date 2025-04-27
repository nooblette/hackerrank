// https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
import java.io.*;
import java.util.*;

public class Solution {
    private static int B;
    private static int H;
    private static boolean FLAG = true;
    
    // At class loading time, executed once
    static {
        Scanner scanner = new Scanner(System.in);
        
        B = scanner.nextInt();
        H = scanner.nextInt();
        
        if(B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            FLAG = false;
        }
        
        scanner.close();
    }
    public static void main(String[] args) {
        if(FLAG) {
            System.out.println(B * H);
        }
    }
}
