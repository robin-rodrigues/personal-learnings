import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static void main (String[] args) throws IOException
     {  
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++)
            {
                a[i] = sc.nextInt();
            }
            
            Arrays.sort(a);
            int count = 0;
            for(int i=n-1; i>1; i--)
            {
                int j = 0;
                int k = i-1;
                while(j<k)
                {
                    if(a[j]+a[k] == a[i])
                    {
                        count++ ;
                        j++;
                        k--;
                        
                    }
                    else if(a[j]+a[k] < a[i])
                    j++;
                    else
                    k--;
                }
    
            }
            if(count!=0)
                System.out.println(count);
            else
                System.out.println(-1);

        }
     }
}