//problem statement https://www.hackerrank.com/challenges/the-birthday-bar
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class The_Birthday_Bar {

    static int solve(int n, int[] s, int d, int m){
        // Complete this function
        int num=0,temp=0;
        for(int i=0;i<=n-m;i++){
            for(int j=i;j<m+i;j++){
                temp=temp+s[j];
            }
            if(temp==d){
                num++;
            }
            temp=0;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
