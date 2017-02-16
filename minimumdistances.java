//problem statement https://www.hackerrank.com/challenges/minimum-distances
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class minimumdistances  {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int d;
        int f=0;
        //
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(A[i]==A[j]){
                    d=j-i;
                    if(d<min){
                    min=d;
                        f=1;
                }
                }
                
            }
        }
        if(f==1){
        System.out.println(min);
        }
        else{
            System.out.println(-1);
        }
        
    }
}
