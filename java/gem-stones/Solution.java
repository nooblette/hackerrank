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
        Set<Character> common = arr.get(0).chars()
            .mapToObj(c -> (char)c)
            .collect(Collectors.toSet());
            
        for(int i = 1; i < arr.size(); i++) {
            Set<Character> thisRock = arr.get(i).chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.toSet());
                
            common.retainAll(thisRock);
            if(common.size() == 0) {
                return 0;
            }
        }
        
        return common.size();
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
