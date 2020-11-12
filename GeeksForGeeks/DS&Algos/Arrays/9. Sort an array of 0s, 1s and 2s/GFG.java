import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	    //code your logic here
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
	    while(t-->0){
	        int n = Integer.parseInt(br.readLine());
	        int[] a = new int[n];
	        int[] count = new int[3];
	        
	        String line = br.readLine();
			int i = 0;
			for (String numStr: line.split("\\s")){
				a[i] = Integer.parseInt(numStr);
				count[a[i]]++;
				i++;
			}
			
			int c_index = 0;
			for(i=0;i<n;i++){
			    if(count[c_index] == 0){
			        ++c_index;
			        if(count[c_index] == 0)
			            ++c_index;
			    }
		        a[i] = c_index;
		        --count[c_index];
			}
			
			for(i=0;i<n;i++){
			    System.out.print(a[i]+" ");
			}
			System.out.println();
	    }
	 }
}	