// https://www.hackerrank.com/challenges/gem-stones
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
    public static int gemstones(List<String> arr) {
        int n = arr.size();
        int[] freq = new int[26];
        
        for(String str : arr) {
            boolean[] present = new boolean[26];
            for(char c : str.toCharArray()) {
                if(present[c - 'a']) continue;
                present[c - 'a'] = true;
                freq[c - 'a']++;
            }
        }
        
        int answer = 0;
        for(int i = 0; i < 26; i++) {
            if(freq[i] == n) {
                answer++;
            }
        }
        
        return answer;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> arr = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int result = Result.gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
