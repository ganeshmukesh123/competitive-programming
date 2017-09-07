import java.util.*;
import java.lang.*;
import java.io.*;

class Demented
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int testCase;
		testCase=sc.nextInt();
    		while(testCase>0){
    		    int start,end;
    		    start=sc.nextInt();
    		    end=sc.nextInt();
        		int n,t;
        		int sum,cnt=0;
        		for(int i=start;i<=end;i++){
        		    n=i;
        		    sum=0;
            		while(true){
            		    sum=0;
            		    while(n>0){
            		        t=n%10;
            		        n=n/10;
            		        sum=sum+t*t;
            		    }
            		    //System.out.println(sum);
            		    if(sum==1){
            		        //System.out.println("Demented "+i);
            		        cnt++;
            		        break;
            		    }
            		    else if(sum<10){
            		        //System.out.println("not Demented "+i);
            		        break;
            		    }
            		    else{
            		        n=sum;
            		    }
            		}
        		}
        		System.out.println(cnt);
        		testCase--;
    		}
	}
}
