// https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        while(n-- > 0) {
            list.add(scanner.nextInt());
        }
        
        int queryCount = scanner.nextInt();
        while(queryCount-- > 0) {
            String query = scanner.next();
            switch (query) {
                case "Insert" :
                    int index = scanner.nextInt();
                    int element = scanner.nextInt();
                    list.add(index, element);
                    break;
                case "Delete" :
                    int index2 = scanner.nextInt();
                    list.remove(index2);
                    break;
            }
        }
        
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        scanner.close();
    }
}
