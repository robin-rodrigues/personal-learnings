// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            int[] ptr = ob.checkDoorStatus(N);
            for(int i=0 ; i<N ; i++)
            {
                System.out.print(ptr[i]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int[] checkDoorStatus(int N) {
        // code here
        int[] a = new int[N];
        int id = 1;
        while(id<=N)
        {
            for(int i=id-1;i<N;i=i+id){
                a[i] = (a[i]==0?1:0);
            }
            id++;
        }
        return a;
    }
};