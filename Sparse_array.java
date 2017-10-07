//Problem Statement https://www.hackerrank.com/challenges/sparse-arrays/problem
import java.io.*;
import java.util.*;

public class Sparse_array {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        String st[] = new String[n];
        for(int i=0;i<n;i++){
            st[i]=sc.next();
        }
        int q=sc.nextInt();
        String q_st[] = new String[q];
        for(int i=0;i<q;i++){
            q_st[i]=sc.next();
        }
        for(int i=0;i<q;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(q_st[i].equals(st[j])){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
