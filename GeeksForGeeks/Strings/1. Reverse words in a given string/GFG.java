import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-->0){
	        String s = sc.next();
	        String[] a = s.split("\\.");
	        StringBuilder sb = new StringBuilder();
	        for(int i=a.length-1;i>0;i--){
	            sb.append(a[i]+".");
	        }
	        sb.append(a[0]);
	        System.out.println(sb);
	    }
	 }
}