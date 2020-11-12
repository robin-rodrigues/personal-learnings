import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    while(t-->0){
	        String[] size = br.readLine().trim().split("\\s+");
	        int n = Integer.parseInt(size[0]);
	        int m = Integer.parseInt(size[1]);
	        
	        String[] input1 = br.readLine().trim().split("\\s+");
	        int[] a = new int[n];
	        for(int i=0;i<n;i++){
	            a[i] = Integer.parseInt(input1[i]);
	        }
	        
	        String[] input2 = br.readLine().trim().split("\\s+");
	        int[] b = new int[m];
	        for(int i=0;i<m;i++){
	            b[i] = Integer.parseInt(input2[i]);
	        }
	        
	        sortWithoutSpace(a,b);
	        
	    }
	 }
	 
	 static void sortWithoutSpace(int a[],int b[]){
	     int ptr1=a.length-1,ptr2=0;
	        while(ptr1>=0&&ptr2<b.length){
	            //Swapping elements
	            if(a[ptr1]>b[ptr2]){
	                a[ptr1]=a[ptr1] + b[ptr2];
	                b[ptr2]=a[ptr1] - b[ptr2];
	                a[ptr1]=a[ptr1] - b[ptr2];
	            }
	            ptr1--;
	            ptr2++;
	        }
	        
	        Arrays.sort(a);
	        Arrays.sort(b);
	        
	        StringBuilder sb = new StringBuilder();
    	    for(int i=0;i<a.length;i++)
    	    {
    	        sb.append(a[i]+" ");
    	    }
    	     
    	    for(int i=0;i<b.length;i++)
    	    {
    	        sb.append(b[i]+" ");
    	    }
    	     
    	    System.out.println(sb);
	 }
}