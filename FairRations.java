//problem statement https://www.hackerrank.com/challenges/fair-rations
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FairRations {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sum=0,count=0;
        int B[] = new int[N];
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
            sum=sum+B[B_i];
        }
        //if sum is even than it is not possible to distribute even number of bread
        if(sum%2!=0){
            System.out.println("NO");
        }
        else{
            for(int i=0;i<N-1;i++){
                if(B[i]%2==0){
                    
                }
                else{
                    B[i]++;
                    B[i+1]++;
                    count+=2;
                }
            }
            System.out.println(count);
        }
    }
}
