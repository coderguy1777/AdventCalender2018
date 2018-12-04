package Day2;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;


public class Day2P1 {
    public static ArrayList<String>datalist = new ArrayList<>();
    public static void main(String[]args) {

        try {
            Scanner scan;
            scan = new Scanner(new BufferedReader(new FileReader("Data")));
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;
            int f = 0;
            int g = 0;
            int h = 0;
            int ii = 0;
            int j = 0;
            int k = 0;
            int l = 0;
            int m = 0;
            int n = 0;
            int o = 0;
            int p = 0;
            int q = 0;
            int r = 0;
            int s = 0;
            
            while (scan.hasNextLine()) {
                String scany = scan.nextLine();

                datalist.add(scany);
                for(int i = 0; i < scany.length(); i++) {
                    if(scany.charAt(i) == 'a' ) {
                        a++;
                    }
                    if(scany.charAt(i) == 'b') {
                        b++;
                    }
                    if(scany.charAt(i) == 'c') {
                        c++;
                    }
                    if(scany.charAt(i) == 'd') {
                        d++;
                    }
                    if(scany.charAt(i) == 'e') {
                        e++;
                    }
                    if(scany.charAt(i) == 'f') {
                        f++;
                    }
                }
            }
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
            System.out.println(f);


        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
