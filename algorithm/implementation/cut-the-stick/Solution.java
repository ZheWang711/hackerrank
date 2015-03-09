import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n, s, x;
        Integer a[];
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(br.readLine());
            String input = br.readLine();
            String ars[] = input.split(" ");
            a = new Integer[ars.length];
            for(int i = 0; i < ars.length ; i++) {
                a[i] = Integer.parseInt(ars[i]);
            }
            Arrays.sort(a,Collections.reverseOrder());
            s = a.length;
            x = a[s - 1];
            while(s > 0) {
                System.out.println(s);
                s = 0;
                int y = 0;
                for (int i = 0; i < a.length && a[i] > 0; ++i) {
                    a[i] = a[i] - x;
                    
                    if(a[i] > 0) {
                        s++;
                        y = a[i];
                    }
                    else break;
                }
                x = y;
            }
        } catch(IOException io){
            io.printStackTrace();
        }	
    }
}