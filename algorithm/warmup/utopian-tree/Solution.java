import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        int[] a;
        int[] b;
        t = in.nextInt();
        a = new int[t];
        b = new int[t];
        for (int i=0;i<t;i++) {
            a[i] = in.nextInt();
            b[i] = 1;
        }
        for (int i=0;i<t;i++) {
            for(int j = 0; j < a[i]; j++) {
                if(j % 2 == 0) {
                    b[i] *= 2;
                } else {
                    b[i] += 1;
                }
            }
        }
        for (int i=0;i<t;i++) {
            System.out.println(b[i]);
        }
    }
}