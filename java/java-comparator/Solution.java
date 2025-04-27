// https://www.hackerrank.com/challenges/java-comparator/problem?isFullScreen=true
import java.io.*;
import java.util.*;

public class Solution {
    static class Player {
        String name;
        int score;
        
        public Player(String name, int score) {
            this.name = name;
            this.score = score;
        }
        
        @Override
        public String toString() {
            return this.name + " " + this.score;
        }
    }
    
    static class Checker implements Comparator<Player> {
        @Override
        public int compare(Player a, Player b) {
            if(a.score > b.score) {
                return -1;
            } else if(a.score < b.score) {
                return 1;
            } else {
                return a.name.compareTo(b.name);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Player> players = new ArrayList<>();
        while(n-- > 0) {
            String name = scanner.next();
            int score = scanner.nextInt();
            
            players.add(new Player(name, score));
        }
        scanner.close();
        
        players.sort(new Checker());
        players.forEach(player -> {
            System.out.println(player);
        });
    }
}
