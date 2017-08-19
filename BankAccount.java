//problem statement https://www.hackerrank.com/contests/gs-codesprint/challenges/bank-accounts
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BankAccount {

    static String feeOrUpfront(int n, int k, int x, int d, int[] p) {
        // Complete this function
        double charge=0;
        for(int i=0;i<n;i++){
            double temp=x*0.01*p[i];
            double chargeEachPay=max(k,temp);
            charge+=chargeEachPay;
            //checking for step 2 is more profilable ?
            if(charge>d){
                return "upfront";
            }
        }
        if(charge>d){
            return "upfront";
        }
        else{
            return "fee";
        }
    }
    
    static double max(double k,double amt){
        if(k>amt){
            return k;
        }
        else{
            return amt;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int x = in.nextInt();
            int d = in.nextInt();
            int[] p = new int[n];
            for(int p_i = 0; p_i < n; p_i++){
                p[p_i] = in.nextInt();
            }
            String result = feeOrUpfront(n, k, x, d, p);
            System.out.println(result);
        }
        in.close();
    }
}
