// https://www.hackerrank.com/challenges/java-lambda-expressions/problem?isFullScreen=true
import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isOdd() {
        return (int a) -> a % 2 != 0;
    }
    
    public PerformOperation isPrime() {
        return (int a) -> {
            if(a <= 3) {
                return true;
            }
            
            if(a % 2 == 0) {
                return false;
            }
            
            for(int i = 5; i < Math.sqrt(a); i++) {
                if(a % i == 0) {
                    return false;
                } 
            }
            
            return true;
        };
    }
    
    public PerformOperation isPalindrome() {
        return (int a) -> {
            String s = String.valueOf(a);
            if(s.length() == 1) {
                return true;
            }
            
            if(s.length() == 2) {
                return s.charAt(0) == s.charAt(1);
            }

            for(int i = 0; i < s.length() / 2; i++) {
                if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    return false;
                }
            }
            
            return true;
        };
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        MyMath myMath = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            switch (ch) {
                case 1:
                    if(MyMath.checker(myMath.isOdd(), num)) {
                        System.out.println("ODD");
                    } else {
                        System.out.println("EVEN");
                    }
                    break;
                case 2:
                    if(MyMath.checker(myMath.isPrime(), num)) {
                        System.out.println("PRIME");
                    } else {
                        System.out.println("COMPOSITE");
                    }
                    break;
                case 3:
                    if(MyMath.checker(myMath.isPalindrome(), num)) {
                        System.out.println("PALINDROME");
                    } else {
                        System.out.println("NOT PALINDROME");
                    }
                    break;
            }
        }
    }
}
