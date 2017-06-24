//problem statement https://www.hackerrank.com/challenges/2d-array
import java.io.*;
import java.util.*;

public class hourglass {
 
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[6][6];
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int temp,max=-9999;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                temp=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                if(max<temp){
                    max=temp;
                }
            }
        }
        System.out.println(max);
    }
    
}
