// https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
import java.io.*;
import java.util.*;

public class Solution {
    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) {
            return false;
        }
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        // frequency array, index based ascii code
        int[] freqs = new int[26];
        for(int i = 0; i < a.length(); i++) {
            freqs[a.charAt(i) - 'a']++;
            freqs[b.charAt(i) - 'a']--;
        }
        
        for(int i = 0; i < freqs.length; i++) {
            if(freqs[i] != 0) {
                return false;
            }
        }
        
        return true;
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
