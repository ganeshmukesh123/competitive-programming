//Quesqion https://www.hackerrank.com/contests/hourrank-23/challenges/halloween-sale
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HalloweenSale {

    static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int count=0;
            while(s>=p){
                count++;
                s=s-p;
                if(p>=(m+d)){
                    
                    p=p-d;
                }
                else{
                    //s=s-m;
                    p=m;
                }
            }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int d = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        int answer = howManyGames(p, d, m, s);
        System.out.println(answer);
        in.close();
    }
}
