//Problem statement https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerrankInAString {

    public static void main(String[] args) {
        String t=new String("hackerrank");
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int len;
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            len=0;
            // your code goes here
            for(int i=0,j=0;i<s.length();i++){
                if(j<t.length()){
                    if(s.charAt(i)==t.charAt(j)){
                        j++;
                        len++;
                    }
                }
                else{
                    break;
                }
            }
            if(len==t.length()){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
