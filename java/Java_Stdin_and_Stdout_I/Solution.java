// https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 3;
        int[] integers = new int[size];
        for(int i = 0; i < size; i++) {
            int integer = scanner.nextInt();
            integers[i] = integer;
        }
        scanner.close();
        
        for(int i = 0; i <size; i++) {
            System.out.println(integers[i]);
        }    }
}
