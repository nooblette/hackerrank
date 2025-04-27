// https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 1;
        while(scanner.hasNext()) {
            String string = scanner.nextLine();
            System.out.printf("%d %s\n", index++, string);
        }
        
        scanner.close();
    }
}
