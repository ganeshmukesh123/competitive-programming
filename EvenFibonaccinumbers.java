//problem statement https://www.hackerrank.com/contests/projecteuler/challenges/euler002
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EvenFibonaccinumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long sum=0;
            long f0=0,f1=1,f=0;
            while(f<n){
                if(f%2==0){
                    sum+=f;
                }
                f=f1+f0;
                f0=f1;
                f1=f;
                
            }
            System.out.println(sum);
        }
    }
}
