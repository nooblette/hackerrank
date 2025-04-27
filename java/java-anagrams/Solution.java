// https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
import java.io.*;
import java.util.*;

public class Solution {
    static boolean isAnagram(String a, String b) {
        char[] aArray = a.toUpperCase().toCharArray();
        char[] bArray = b.toUpperCase().toCharArray();
        
        Arrays.sort(aArray);
        Arrays.sort(bArray);
        
        int size = aArray.length < bArray.length ? aArray.length : bArray.length;
        for(int i = 0; i < size; i++) {
            if(aArray[i] != bArray[i]) {
                return false;
            }
        }
        
        return aArray.length == bArray.length;
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
