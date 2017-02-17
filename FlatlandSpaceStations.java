//problem statement https://www.hackerrank.com/challenges/flatland-space-stations
import java.io.*;
import java.util.*;

public class FlatlandSpaceStations {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int max=0;
        int spaceStation[]=new int[m];
        for(int i=0;i<m;i++){
            spaceStation[i]=sc.nextInt();
        }
        Arrays.sort(spaceStation);
        
        if(m==n){
            
        }
        else{
            max=spaceStation[0]-0;
            int t1,t2,t;
            for(int i=1;i<m;i++){
                t1=spaceStation[i-1];
                t2=spaceStation[i];
                t=(t1+t2)/2-t1;
                if(max<t){
                    max=t;
                }
            }
            if(max<(n-1-spaceStation[m-1])){
                max=(n-1-spaceStation[m-1]);
            }
            
        }
        System.out.println(max);
    }
}
