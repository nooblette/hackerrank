import java.io.*;
import java.util.*;
import java.util.stream.*;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id   = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID()   { return id; }
    public String getName() { return name; }
    public double getCGPA() { return cgpa; }
}

class Criteria implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        if(a.getCGPA() > b.getCGPA()) {
            return -1;
        } else if(a.getCGPA() < b.getCGPA()) {
            return 1;
        } else {
            int nameCompare = a.getName().compareTo(b.getName());
            return nameCompare != 0 ? nameCompare : a.getID() - b.getID();
        }
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> pq = new PriorityQueue<>(new Criteria());
        events.forEach(event -> {
            String[] queryAndParams = event.split(" ");
            switch (queryAndParams[0]) {
                case "ENTER" :
                    Student student = new Student(
                        Integer.valueOf(queryAndParams[3]), 
                        queryAndParams[1], 
                        Double.valueOf(queryAndParams[2])
                    );
                    pq.offer(student);
                    break;
                case "SERVED" :
                    pq.poll();
                    break;
            }
        });
        
        List<Student> result = new ArrayList<>();
        while(!pq.isEmpty()) {
            result.add(pq.poll());
        }
        return result;
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            events.add(scan.nextLine());
        }
        scan.close();

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
