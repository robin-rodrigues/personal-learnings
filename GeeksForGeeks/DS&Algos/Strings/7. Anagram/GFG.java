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
	        String line = br.readLine();
	        String[] s = line.split(" ");
	        
	        char[] c1 = s[0].toCharArray();
	        char[] c2 = s[1].toCharArray();
	        
	        int[] f1 = new int[27];
	        int[] f2 = new int[27];
	        
	        for (Character c : c1){
	            f1[c-'a'+1]++;
	        }
	        
	        for (Character c : c2){
	            f2[c-'a'+1]++;
	        }
            
            int flag = 1;
            for(int i=1;i<27;i++){
                if(f1[i]!=f2[i]){
                    flag = 0;
                    break;
                }
            }
            
            if(flag==1)
                System.out.println("YES");
            else
                System.out.println("NO");
	    }
	 }
}