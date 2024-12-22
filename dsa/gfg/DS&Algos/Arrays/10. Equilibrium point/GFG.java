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
            int sum = 0, temp_sum = 0,temp_sum_1 = 0, temp_sum_2 = 0, index=0, flag = 0;
	        
	        String line = br.readLine();
			int i = 0;
			for (String numStr: line.split("\\s")){
				a[i] = Integer.parseInt(numStr);
				sum+=a[i];
				i++;
			}
	        
	        if(n==1)
	            System.out.println(1);
	            
	        else{
	            for(i=0;i<n;i++){
	                temp_sum +=a[i];
	                
	                if(temp_sum<sum/2)
	                    temp_sum_1 += a[i];
	                else if((temp_sum>sum/2)&&flag==0){
	                    index = i;
	                    flag=1;
	                }
	                else
	                    temp_sum_2 += a[i];
	            }
	            
	            if(temp_sum_1 == temp_sum_2)
	                System.out.println(index+1);
	            else
	                System.out.println(-1);
	        }
	    }
	 }
}