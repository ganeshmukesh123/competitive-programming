//question https://www.hackerrank.com/challenges/special-multiple/problem
import java.io.*;
import java.util.*;

public class SpecialMultiple {
    
    static long binary(long n){
        StringBuilder s=new StringBuilder();
        while(n>0){
            if(n%2==0){
                s.append("0");
                n=n/2;
            }
            else{
                s.append("1");
                n=n/2;
            }
        }
        s.reverse();
        return Long.parseLong(s.toString());
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            long a=sc.nextLong();
            for(long j=1;;j++){
                
                long temp=binary(j)*9;
                
                if(temp%a==0){
                    System.out.println(temp);
                    break;
                }
            }
        }
    }
}
