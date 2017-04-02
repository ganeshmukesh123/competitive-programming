//https://www.hackerrank.com/challenges/birthday-cake-candles
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class birthday_cake_candles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        Arrays.sort(height);
        int max=height[n-1];
        int c=0;
        for(int i=n-1;i>=0;i--){
            if(height[i]==max){
                c++;
            }
            else{
                break;
            }
        }
        System.out.println(c);
    }
}
