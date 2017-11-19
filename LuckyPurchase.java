//question https://www.hackerrank.com/contests/w35/challenges/lucky-purchase/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LuckyPurchase {
    
    static int check(int n){
        int t=n,c;
        int c4=0,c7=0,r=0,l=0;
        while(t!=0){
            c=t%10;
            if(c==4){
                c4++;
            }
            else if(c==7){
                c7++;
            }
            else{
                r++;
            }
            l++;
            t=t/10;
        }
        if(c4 == c7 && r == 0){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map <String,Integer> l=new HashMap();
        for(int a0 = 0; a0 < n; a0++){
            String s = in.next();
            int nn = in.nextInt();
            if(check(nn)==1){
                l.put(s,nn);
            }
        }
        if(l.size() == 0){
            System.out.println(-1);
        }
        else{
            int min=Integer.MAX_VALUE;
            String ans=new String();
            for (Map.Entry<String, Integer> entry : l.entrySet()) {
                String key = entry.getKey().toString();
                Integer value = entry.getValue();
                if(min>value){
                    min=value;
                    ans=key;
                }
            }
            System.out.println(ans);
        }
        in.close();
    }
}
