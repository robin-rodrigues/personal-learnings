import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] close = new int[n];
        int[] open = new int[n];
        
        for(int i=0;i<n;i++){
            close[i] = 1;    
        }
        
        for(int i=0;i<q;i++){
            int state = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count = 0;
            if(state == 1){
                for(int j=a;j<=b;j++){
                   count+=open[j]; 
                }
                System.out.println(count);
            }else {
                for(int j=a;j<=b;j++){
                    open[j] ^= 1;
                    close[j] ^= 1;
                }
            }
        }
        
    }
}