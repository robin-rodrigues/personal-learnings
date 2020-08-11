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
	       
	        String line = br.readLine();
			int i = 0;
			for (String numStr: line.split("\\s")){
				a[i] = Integer.parseInt(numStr);
				i++;
			}
			
			ArrayList<Integer> leader = new ArrayList<Integer>();
			int l = a[n-1];
		    leader.add(l);
			
			for(i=n-2;i>=0;i--){
			    if(a[i]>=l){
			        l = a[i];
			        leader.add(l);
			    }
			}
			
			StringBuilder sb = new StringBuilder();
			for(i=leader.size()-1;i>=0;i--){
			    sb.append(leader.get(i)+" ");
			}
			System.out.println(sb);
	    }
	 }
}