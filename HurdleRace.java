//problem statement https://www.hackerrank.com/challenges/the-hurdle-race/problem
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HurdleRace {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        // your code goes here
        int drink=0,t=k;
        for(int h=0;h<n;h++){
            if(height[h]>t){
                drink=drink+height[h]-t;
                t=height[h];
            }
        }
        System.out.println(drink);
    }
}
