# https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        
        int loop = 10;
        for(int i = 1; i <= loop; i++) {
            System.out.printf("%d x %d = %d\n", N, i, N * i);   
        }
    }
}
