import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {

		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int n = sc.nextInt();
		    ArrayList<String> numbers=new ArrayList<>();
		    for(int i=0;i<n;i++)
		    {
		        numbers.add(String.valueOf(sc.next()));
		    }
		    Collections.sort(numbers,new Comp());
		    
		    for(String number : numbers)
		    {
		        System.out.print(number);
		    }
		    System.out.println();
		}
	}
	
	public static class Comp implements Comparator<String>
	{
	    public int compare(String str1,String str2)
	    {

	        return -Integer.compare(Integer.parseInt(str1+str2),Integer.parseInt(str2+str1));
	    }
	}
}