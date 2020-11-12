import java.util.;
import java.lang.;
import java.io.;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	    code your logic here
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t--0){
		    String s = br.readLine();
		    removeDuplicates(s);
		    System.out.println();
		}
	    
	 }
	 
	 static void removeDuplicates(String str) 
     { 
        LinkedHashSetCharacter lhs = new LinkedHashSet(); 
        for(int i=0;istr.length();i++) 
            lhs.add(str.charAt(i)); 
          
        //print string after deleting duplicate elements 
        for(Character ch  lhs) 
            System.out.print(ch);
            
     } 
}