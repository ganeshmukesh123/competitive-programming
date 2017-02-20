//problem statement https://www.hackerrank.com/contests/university-codesprint-2/challenges/breaking-best-and-worst-records
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BreakingtheRecords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        // your code goes here
        int lowest,highest;
        int lCount=0,hCount=0;
        lowest=score[0];
        highest=score[0];
        for(int i=0;i<n;i++){
            if(lowest>score[i]){
                lowest=score[i];
                lCount++;
            }
            if(highest<score[i]){
                highest=score[i];
                hCount++;
            }
        }
        System.out.println(hCount+" "+lCount);
    }
}
