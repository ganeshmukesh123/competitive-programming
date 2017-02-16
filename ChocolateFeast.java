//problem statement https://www.hackerrank.com/challenges/chocolate-feast
import java.io.*;
import java.util.*;

public class ChocolateFeast {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n,c,m;
        while(t>0){
            n=sc.nextInt();
            c=sc.nextInt();
            m=sc.nextInt();
            //ch count total number of chocolate
            //wr count wrapper
            int ch,wr;
            ch=n/c;
            wr=ch;
            while(wr>=m){
                wr=wr-m;
                ch++;
                wr++;
            }
            System.out.println(ch);
            t--;
        }
    }
}
