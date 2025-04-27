// https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
import java.io.*;
import java.util.*;

public class Solution {
    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) {
            return false;
        }
        char[] aArray = a.toUpperCase().toCharArray();
        char[] bArray = b.toUpperCase().toCharArray();
        
        Arrays.sort(aArray);
        Arrays.sort(bArray);
        
        return Arrays.equals(aArray, bArray);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
