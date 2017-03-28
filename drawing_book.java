Problem statement https://www.hackerrank.com/challenges/drawing-book
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class drawing_book {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        // your code goes here
        int f=p/2;         //counting from first page(page no 1)
        int b=(n-p)/2;     //counting from last page
        System.out.println(f<b?f:b);
        
    }
}
