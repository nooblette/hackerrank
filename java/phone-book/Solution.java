// https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        
        Map<String, Integer> books = new HashMap<>();
        while(n-- > 0) {
            String name = scanner.nextLine();
            int phoneNumber = Integer.parseInt(scanner.nextLine());
            books.put(name, phoneNumber);
        }
        
        while(scanner.hasNext()) {
            String name = scanner.nextLine();
            if(books.containsKey(name)) {
                System.out.println(name + "=" + books.get(name));
            } else {
                System.out.println("Not found");
            }
        }
        scanner.close();
    }
}
