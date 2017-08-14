// problem statement https://www.hackerrank.com/contests/projecteuler/challenges/euler003
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LargestPrimeFactor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long largest_prime=2,i=2;
            while(i*i<=n){
                while(n%i==0){
                    largest_prime=i;
                    n=n/i;
                }
                i++;
            }
            if(n>largest_prime){
                largest_prime=n;
            }
            System.out.println(largest_prime);
        }
    }
}
