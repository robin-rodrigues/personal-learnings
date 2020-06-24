import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        HashMap<Long,Long> day_run = new HashMap<Long,Long>();
        for(long i=0;i<n;i++){
            long d = sc.nextInt();
            long r = sc.nextInt();
            if(day_run.containsKey(d)){
                if(day_run.get(d)<r){
                    day_run.put(d,r);
                }
            }else{
                day_run.put(d,r);
            }
            
           
        }
        Long[] value = new Long[day_run.size()];
        int index = 0;
    
        for (Map.Entry<Long, Long> mapEntry : day_run.entrySet()) {
            value[index] = mapEntry.getValue();
            index++;
        }
        
        long max = value[0];
        index = 0;
         for (int i = 1; i < value.length; i++) {
             if (value[i] > max){
                 max = value[i];
                 index = i;
             } 
         }
        
        value[index] = (long)0;
        
        long max2 = value[0];
         for (int i = 1; i < value.length; i++) {
             if (value[i] > max2){
                 max2 = value[i];
             } 
         }
        System.out.println(max+max2);
    }
}