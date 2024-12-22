// Doesn't works for all negative numbers test cases
// Scanner is slower than BufferedReader and hence doesnt passes all test cases due to Timeout error 
// Used BufferedReader instead of Scanner since it works faster and passes all test cases


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG1
 {
	public static void main (String[] args) throws IOException
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
	    while(t-->0){
	        int n = Integer.parseInt(br.readLine());
	        int[] a = new int[n];
	       
	        String line = br.readLine();
			int i = 0;
			for (String numStr: line.split("\\s")){
				a[i] = Integer.parseInt(numStr);
				i++;
			}
            
            int maxSoFar = a[0], currMax = a[0];
            
            for(i=1;i<n;i++){
                currMax = Math.max(a[i],currMax+a[i]);
                maxSoFar = Math.max(maxSoFar,currMax);
            }
	        System.out.println(maxSoFar);
	    }
	    
	 }
}

