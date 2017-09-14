//problem statement https://www.hackerrank.com/challenges/summing-the-n-series/problem
import java.io.*;
import java.util.*;
import java.math.*;

public class SummingNSeries {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            BigInteger n = new BigInteger(sc.next());
             BigInteger f = new BigInteger("1000000007");
            System.out.println(((n.mod(f)).multiply(n.mod(f)).mod(f)));
            t--;
        }
    }
}
