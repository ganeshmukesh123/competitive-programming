//https://www.hackerrank.com/challenges/pairs/problem
import java.io.*;
import java.util.*;

public class Pairs {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n;
        int k;
        n=sc.nextInt();
        k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int count=0;
        Arrays.sort(a);
        for(int i=0;i<n-1;i++){
            for(int j= i+1;j<n;j++){
                if(Math.abs(a[i]-a[j])>k){
                    break;
                }
                if(Math.abs(a[i]-a[j])==k){
                    count++;
                }
            }
        }
        System.out.println(count);
        
        
    }
}
