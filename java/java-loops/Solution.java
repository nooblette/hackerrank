# https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {
    private static int power(int n) {
        int result = 1;
        while(n > 0) {
            result = result * 2;
            n--;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = Integer.valueOf(scanner.nextLine());
        
        // a, b, n save
        List<List<Integer>> values = new ArrayList<>();
        for(int i = 0; i < q; i++) {
            String[] inputValues = scanner.nextLine().split(" ");
            // input
            List<Integer> aAndbAndN = Arrays.stream(inputValues)
                .map(Integer::valueOf)
                .collect(Collectors.toList());
                
            // add List
            values.add(aAndbAndN);
        }
        
        scanner.close();
        
        for(int i = 0; i < q; i++) {
            List<Integer> aAndbAndN = values.get(i);
            int a = aAndbAndN.get(0);
            int b = aAndbAndN.get(1);
            int n = aAndbAndN.get(2);
            
            int[] dp = new int[n];
            dp[0] = a + b;
            for(int j = 1; j < n; j++) {
                dp[j] = dp[j-1] + power(j) * b;
            }
            
            for(int j = 0; j < n; j++) {
                System.out.print(dp[j] + " ");    
            }
            System.out.println();   
        }
    }
}
