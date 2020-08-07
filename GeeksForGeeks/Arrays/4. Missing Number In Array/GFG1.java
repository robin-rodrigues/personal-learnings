//O(n) time and O(1) space - XOR method

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG1
 {
	public static void main (String[] args)
	 {
	    //code your logic here
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        int n = sc.nextInt();
	        int[] a = new int[n-1];
	        
	        for(int i=0;i<n-1;i++){
	            a[i] = sc.nextInt();
	        }
	        
	        int a1 = a[0];
	        int c1 = 1;
	        
	        for(int i=1;i<n-1;i++){
	            a1 ^= a[i];
	        }
	        
	        for(int i=2;i<=n;i++){
	            c1 ^= i;
	        }
	        
	        System.out.println(a1^c1);
	        
	    }
	 }
}