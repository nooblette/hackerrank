// https://www.hackerrank.com/challenges/java-sort/problem
import java.io.*;
import java.util.*;

public class Solution {
    static class Student {
        Integer id;
        String name;
        double cgpa;
        
        public Student(Integer id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Student> students = new ArrayList<>();
        while(n-- > 0) {
            int id = scanner.nextInt();
            String name = scanner.next();
            double cgpa = scanner.nextDouble();
            
            students.add(new Student(id, name, cgpa));
        }
        
        students.sort((a, b) -> {
            if(a.cgpa > b.cgpa) {
                return -1;
            } else if(a.cgpa < b.cgpa) {
                return 1;
            } else {
                int nameComparing = a.name.compareTo(b.name);
                if(nameComparing == 0) {
                    return a.id.compareTo(b.id);
                }
                
                return nameComparing;
            }
         });
        
        students.forEach(student -> System.out.println(student.name));
        scanner.close();
    }
}
