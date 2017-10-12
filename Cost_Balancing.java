//problem statement https://www.hackerrank.com/contests/moodys-analytics-fall-university-codesprint/challenges/cost-balancing
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Cost_Balancing {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int amount1[] = new int[m+1];
        int total=0;
        for(int a0 = 0; a0 < n; a0++){
            int id_number = in.nextInt();
            int amount = in.nextInt();
            amount1[id_number]=amount1[id_number]+amount;
            total=total+amount;
        }
        int equity=(int)Math.floor((total*1.0)/m);
        int q=equity+(total-equity*m);
        for(int i=1;i<=m;i++){
            if(i==1){
                System.out.println(i+" "+(amount1[i]-q));
            }
            else{
                System.out.println(i+" "+(amount1[i]-equity));
            }
        }
        in.close();
    }
}
