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
	        int n = Integer.parseInt(br.readLine());
	        long[] arr = new long[n];
	        
	        String[] input = br.readLine().trim().split("\\s+");
	        for(int i=0;i<n;i++){
	            arr[i] = Integer.parseInt(input[i]);
	        }
	        
    	    // initialize index of first minimum and first 
            // maximum element 
            int max_idx = n - 1, min_idx = 0; 
      
            // store maximum element of array 
            long max_elem = arr[n - 1] + 1; 
      
            // traverse array elements 
            for (int i = 0; i < n; i++) { 
                // at even index : we have to put 
                // maximum element 
                if (i % 2 == 0) { 
                    arr[i] += (arr[max_idx] % max_elem) * max_elem; 
                    max_idx--; 
                } 
      
                // at odd index : we have to put minimum element 
                else { 
                    arr[i] += (arr[min_idx] % max_elem) * max_elem; 
                    min_idx++; 
                } 
            } 
      
            // array elements back to it's original form 
            for (int i = 0; i < n; i++) 
                arr[i] = arr[i] / max_elem;
            
            
            for (int i = 0; i < n; i++) 
                System.out.print(arr[i]+" ");
            System.out.println();
            
	   }

    }     
}


/* 
Explanation:
10 20 30 40 50 60 70 80 90 100 110
max_elem=110+1=111, max_idx=10, min_idx=0

After each iteration:
12220 20 30 40 50 60 70 80 90 100 110                       max_idx = 9
12220 1130 30 40 50 60 70 80 90 100 110                     min_idx = 1 
12220 1130 11130 40 50 60 70 80 90 100 110                  max_idx = 8
12220 1130 11130 2260 50 60 70 80 90 100 110                min_idx = 2
12220 1130 11130 2260 10040 60 70 80 90 100 110             max_idx = 7
12220 1130 11130 2260 10040 3390 70 80 90 100 110           min_idx = 3
12220 1130 11130 2260 10040 3390 8950 80 90 100 110         max_idx = 6
12220 1130 11130 2260 10040 3390 8950 4520 90 100 110       min_idx = 4
12220 1130 11130 2260 10040 3390 8950 4520 7860 100 110     max_idx = 5
12220 1130 11130 2260 10040 3390 8950 4520 7860 5650 110    min_idx = 5
12220 1130 11130 2260 10040 3390 8950 4520 7860 5650 6770   max_idx = 4

Then divide each element by max_elem(111):
110 10 100 20 90 30 80 40 70 50 60  (this is the ans)
*/
