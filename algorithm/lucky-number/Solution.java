import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static final int T = 10000;
    static final int MAX = 1458;
    //static long prime[MAX], pc = 0;
    static long numbers[];
    static long dt[][][];
    static final int MAX_DIGITS = 18;
    static final int MAX_SUM = 162;
    static final int MAX_SQUARE = 1458;
    static HashMap<Long, Long> prime;
    
    static long luckyNumbers(long a,long b) {
        /* Complete this function */
        prime = new HashMap<Long, Long>();
        numbers = new long[MAX];
        dt = new long[MAX_DIGITS + 1][MAX_SUM + 1][MAX_SQUARE + 1];
        gen_table();
        return lucky(b) - lucky(a - 1);
    }

    static boolean checkPrime(long n) {
        if(n == 2) return true;
        if(n == 1 || n%2 == 0) return false;
        long prm = prime.get(0);
        int i = 0;
        while(prm * prm <= n) {
            if(n%prm == 0) return false;
            i++;
            prm = prime.get(i);
        }
        return true;
    }

    static boolean isPrime(long n) {
        if(prime.containsKey(n)) {
            return true;
        }
        
        if(checkPrime(n)) {
            prime.put(n, n);
            return true;
        } else {
            return false;
        }
    }

    static long sum(long n) {
        long s = 0;
        while(n > 0) {
            s += n%10;
            n /= 10;
        }
        return s;
    }

    static long sumsq(long n) {
        long s = 0;
        long d = 0;
        while(n > 0) {
            d = n%10;
            s += d*d;
            n /= 10;
        }
        return s;
    }

    static void gen_table() {
        dt[0][0][0] = 1;

        for ( int i = 0; i < MAX_DIGITS; i++) {
            for ( int j = 0; j <= 9 * i; j++) {
                for ( int k = 0; k <= 9 * 9 * i; k++) {
                    for ( int l = 0; l < 10; l++) {
                        dt[i + 1][j + l][k + l*l] += dt[i][j][k];
                    }
                }
            }
        }
    }

    static long lucky(long n) {
        long count = 0;
        int len = 0;
        long digits[] = new long[MAX_DIGITS + 1];
        while (n > 0) {
            digits[len] = n % 10;
            n /= 10;
            len++;
        }
        int sum = 0;
        int sq = 0;
        for ( int i = len-1; i >= 0; i--) {
            long step_count = 0;
            for ( int l = 0; l < digits[i]; l++) {
                for ( int j = 0; j <= 9 * i; j++) {
                    for ( int k = 0; k <= 9 * 9 * i; k++) {
                        if (dt[i][j][k] > 0 && numbers[j + l + sum] > 0 && numbers[k + l*l + sq] > 0) {
                            step_count += dt[i][j][k];
                        }
                    }
                }
            }
            count += step_count;
            sum += digits[i];
            sq += digits[i] * digits[i];
        }
        if (numbers[sum] > 0 && numbers[sq] > 0) {
            ++count;
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long res;
        
        int _a_size = Integer.parseInt(in.nextLine());
        long _a,_b;
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            String next = in.nextLine();
            String[] next_split = next.split(" ");
            _a=Long.parseLong(next_split[0]);
            _b=Long.parseLong(next_split[1]);
           res = luckyNumbers(_a,_b);
           System.out.println(res);
        }
    }
}
