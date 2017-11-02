// https://www.hackerrank.com/contests/hourrank-24/challenges/strong-password
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StrongPassword {

    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int min=0;
        int d=0,u=0,l=0,s=0;
        
            for(int i=0;i<n;i++){
                if(Character.isUpperCase(password.charAt(i))){
                    break;
                }
                if(i==n-1){
                    min++;
                }
            }
            
            for(int i=0;i<n;i++){
                if(Character.isLowerCase(password.charAt(i))){
                    break;
                }
                if(i==n-1){
                    min++;
                }
            }
            
            for(int i=0;i<n;i++){
                if(Character.isDigit(password.charAt(i))){
                    break;
                }
                if(i==n-1){
                    min++;
                }
            }
            
           for(int i=0;i<n;i++){
               //!@#$%^&*()-+
               char ch=password.charAt(i);
                if(ch=='!'||ch=='#'||ch=='$'||ch=='%'||ch=='^'||ch=='&'||ch=='*'||ch=='('||ch==')'||ch=='-'||ch=='+'){
                    break;
                }
                if(i==n-1){
                    min++;
                }
            } 
            return Math.max(min,6-n);
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}
