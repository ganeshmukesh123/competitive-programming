// problem statement https://www.hackerrank.com/challenges/reduced-string/problem
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ReducedString {

    static String super_reduced_string(String s){
        // Complete this function
        String r = new String(s);
        for(int i=1;i<r.length();i++){
            if(r.charAt(i)==r.charAt(i-1)){
                r=r.substring(0,i-1)+r.substring(i+1);
                i=0;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        if(result.length()==0){
            result="Empty String";
        }
        System.out.println(result);
    }
}
