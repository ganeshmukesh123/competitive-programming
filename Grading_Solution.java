//Problem statement https://www.hackerrank.com/challenges/grading
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Grading_Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            // your code goes here
            if(grade>=38){
                int t1;
                //suppose grade=78;
                t1=grade%5;  //t1=78%5=3;
                t1=5-t1;     //This is difference between grade and next multiple of 5    t1=5-3=2
                int nextMultiple;
                nextMultiple=grade+t1;//nextMultiple=78+2=8
                if(t1<3){
                    grade=nextMultiple;
                }
                
            }
            System.out.println(grade);
        }
    }
}
