import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int j=0;j<n;j++)
            {
                a[j] = sc.nextInt();
            }
            long small = a[0];
            int count = 1;
            for(int j=1;j<n;j++){
                if(a[j]>small){
                    count = count;
                }else{
                    small = a[j];
                    count++;
                }
            }
            System.out.println(count); 
        }
    }
}