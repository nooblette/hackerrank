// https://www.hackerrank.com/challenges/ctci-ransom-note/problem
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
    public static void checkMagazine(List<String> magazine, List<String> note) {
        Map<String, Integer> freq = new HashMap<>();
        for(String word : magazine) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        
        for(String word : note) {
            int count = freq.getOrDefault(word, 0);
            
            if(count == 0) {
                System.out.println("No");
                return;
            }
            freq.put(word, count - 1);
        }

        System.out.println("Yes");
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        List<String> magazine = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        List<String> note = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        Result.checkMagazine(magazine, note);

        bufferedReader.close();
    }
}
