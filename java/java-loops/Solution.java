# https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int q = scanner.nextInt();        
        while(q-- > 0) {            
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            
            int sum = a;
            int pow = 1;
            
            for(int i = 0; i < n; i++) {
                sum += pow * b;
                System.out.print(sum + " ");
                pow <<= 1;
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
