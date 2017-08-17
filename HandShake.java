//problem statement https://www.hackerrank.com/challenges/handshake
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HandShake {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int N = in.nextInt();
            int countHandShake=0;
            for(int i=1;i<N;i++){
                countHandShake+=i;
            }
            System.out.println(countHandShake);
        }
    }
}
