//Problem statement  https://www.hackerrank.com/challenges/migratory-birds
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Migratory_birds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        int[] noOfEachTypes=new int[5];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
            noOfEachTypes[types[types_i]-1]++;//counting number of each type of bird
        }
        // your code goes here
        int temp=noOfEachTypes[0];
        int HighestFreqTyp=1;
        for(int i=1;i<5;i++){
            if(temp<noOfEachTypes[i]){
                temp=noOfEachTypes[i];
                HighestFreqTyp=i+1;
            }
        }
        System.out.println(HighestFreqTyp);
    }
}
