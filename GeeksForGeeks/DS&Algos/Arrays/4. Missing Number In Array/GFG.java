//O(n) time and O(n) space
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    //code your logic here
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        int n = sc.nextInt();
	        int[] a = new int[n-1];
	        int[] c = new int[n];
	        for(int i=0;i<n-1;i++){
	            a[i] = sc.nextInt();
	        }
	        
	        for(int i=0;i<n-1;i++){
	            c[a[i]-1] = 1;
	        }
	        
	        for(int i=0;i<n;i++){
	            if(c[i]==0) System.out.println(i+1);
	        }
	        
	    }
	 }
}