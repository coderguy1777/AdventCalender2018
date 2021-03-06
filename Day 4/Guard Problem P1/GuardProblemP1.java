package Day4;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class GuardProblemP1 {
    public static void main(String[] args) throws Exception {
        Map<Integer, int[]> data = new HashMap<Integer, int[]>();
        List<String> input = Files.readAllLines(new File("GuardTime").toPath());
        Collections.sort(input);
        int current = 0;
        int start = 0;
        for (String l : input) {
            int min = Integer.parseInt(l.substring(15, 17));
            boolean shift = l.contains("shift");
            boolean wake = l.contains("wake");
            boolean sleep = l.contains("sleep");

            int id;
            if(shift) {
                id = Integer.parseInt(l.split(" ")[3].substring(1));
                current = id;
                if(!data.containsKey(id)) {
                    data.put(current, new int[60]);
                    Arrays.fill(data.get(current), 0);
                }
            }
            if(sleep) {
                start = min;
            }
            if(wake) {
                for (int i = start; i < min; i++) {
                    data.get(current)[i] += 1;
                }
            }
        }

        List<Integer> keys = new ArrayList(data.keySet());
        int best = keys.get(0);
        int bestsum = 0;
        for (int id : keys) {
            int sum = Arrays.stream(data.get(id)).filter(x -> x >= 1).sum();
            if(sum > bestsum) {
                bestsum = sum;
                best = id;
            }
        }
        int bestMinute = 0;
        int bestTime = 0;
        for(int i = 0; i < 60; i++) {
            if(data.get(best)[i] > bestMinute) {
                bestMinute = data.get(best)[i];
                bestTime = i;
            }
        }
        System.out.println("Guard id: " + best);
        System.out.println("Minute: " + bestTime);
        System.out.println("Solution to part 1: " + best * bestTime);

        best = keys.get(0);
        bestMinute = 0;
        for (int id : keys) {
            int minute = Arrays.stream(data.get(id)).max().orElse(-1);
            if(minute > bestMinute) {
                bestMinute = minute;
                best = id;
            }
        }

        bestTime = 0;
        for(int i = 0; i < 60; i++) {
            if(data.get(best)[i] == bestMinute) {
                bestTime = i;
            }
        }
        System.out.println("Guard id: " + best);
        System.out.println("Minute: " + bestTime);
        System.out.println("Solution to part 2: " + best * bestTime);
    }
}