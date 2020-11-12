// Doesn't works for all negative numbers test cases
//O(n) time complexity

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static int maxSubArray(int a[]){
        int size = a.length;
        int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;
        
        for(int i=0;i<size;i++){
            maxEndingHere += a[i];
            
            if(maxEndingHere<0)
                maxEndingHere = 0;

            else if(maxSoFar<maxEndingHere)
                maxSoFar = maxEndingHere;
        }
        return maxSoFar;
    }
    
	public static void main (String[] args)
	 {
	    //code your logic here
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        int n = sc.nextInt();
	        int[] a = new int[n];
	       
	        for(int i=0;i<n;i++){
	            a[i] = sc.nextInt();
	        }
	        
	        System.out.println(maxSubArray(a));
	    }
	    
	 }
}

