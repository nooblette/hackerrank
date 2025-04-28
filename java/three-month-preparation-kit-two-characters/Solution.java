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
        Set<Character> alpSet = new HashSet<>();
        for(char c : s.toCharArray()) {
            alpSet.add(c);
        }
        
        List<Character> alpList = new ArrayList<>(
            alpSet.stream()
                .collect(Collectors.toList()));
        
        int maxLen = 0;        
        for(int i = 0; i < alpList.size(); i++) {
            for(int j = i + 1; j < alpList.size(); j++) {
                StringBuilder sb = new StringBuilder();
                for(char c : s.toCharArray()) {
                    if(c == alpList.get(i) || c == alpList.get(j)) {
                        sb.append(c);
                    }
                }
                
                if(sb.length() < 2) continue;
                    
                boolean isValid = true;
                for(int k = 1; k < sb.length(); k++) {
                    if(sb.charAt(k-1) == sb.charAt(k)) {                            
                        isValid = false;
                        break;
                    }
                }
                    
                if(isValid) maxLen = Math.max(maxLen, sb.length());
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

