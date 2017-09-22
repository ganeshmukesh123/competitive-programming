//problem statement https://www.hackerrank.com/challenges/counting-valleys/problem
import java.io.*;
import java.util.*;

public class CountingValley {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        String s;
        s=sc.next();
        int count=0,l=0,bs=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='D'){
                l--;
            }
            else{
              l++;  
            }
            if(l<0&&bs==0){
                count++;
                bs=1;
            }
            if(l>=0){
                bs=0;
            }
        }
        System.out.println(count);
    }
}
