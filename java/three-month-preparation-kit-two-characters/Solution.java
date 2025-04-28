// https://www.hackerrank.com/challenges/three-month-preparation-kit-two-characters/problem?isFullScreen=false
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

class Result {
    public static int alternate(String s) {
        boolean[] present = new boolean[26];
        for(char c : s.toCharArray()) {
            present[c - 'a'] = true;
        }
        
        List<Character> chars = new ArrayList<>();
        for(int i = 0; i < 26; i++) {
            if(present[i]) {
                chars.add((char) (i + 'a'));
            }
        }
        
        int maxLen = 0;
        for(int i = 0; i < chars.size(); i++) {
            for(int j = i+1; j < chars.size(); j++) {
                char c1 = chars.get(i);
                char c2 = chars.get(j);
                
                StringBuilder sb = new StringBuilder();
                
                for(char x : s.toCharArray()) {
                    if(x == c1 || x == c2) {
                        sb.append(x);
                    }
                }
                
                if(sb.length() < 2) {
                    continue;
                }
                
                boolean valid = true;
                for (int k = 1; k < sb.length(); k++) {
                    if (sb.charAt(k) == sb.charAt(k - 1)) {
                        valid = false;
                        break;
                    }
                }
                
                if(valid) {
                    maxLen = Math.max(maxLen, sb.length());                    
                }
            }
        }
        return maxLen;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = Result.alternate(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
