package Day1;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;


public class Part1Day1 {
    public static ArrayList<Integer> list = new ArrayList<>();
    public static ArrayList<Integer> list2 = new ArrayList<>();
    public static final int startingfreq = 0;
    public static void main(String[]args) {
        try {
            Scanner scan;
            scan = new Scanner(new BufferedReader(new FileReader("input")));
            while (scan.hasNextLine()) {
                int scann = scan.nextInt();
                list.add(scann);
            }
        } catch(IOException e) {
            System.out.println(e);
        }
        int is = 0;
        int test2 = 0;
        for(int i = 0; i < list.size(); i++) {
            is += list.get(i) + startingfreq;
            System.out.println(is);
        }

    }
}