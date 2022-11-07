//Maximum Subarray Sum
The following table lists all subarrays and their moduli:
		  sum	 %2
[1]		  1	 1
[2]		  2	 0
[3]		  3	 1
[1,2]	  3	 1
[2,3]	  5	 1
[1,2,3] 6	 0
The maximum modulus is 1.
        
        
        
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t--!=0){
            int n= sc.nextInt();
            long m = sc.nextLong();
            int a[]=new int[n];
            for(int i=0; i<n;i++){
                a[i]=sc.nextInt();
            }
            long max=0;
            long sum;
            for(int i=0;i<n;i++){
                sum=0;
                for(int j=i;j<n;j++){
                    sum+=a[j];
                    if(sum%m>max)
                        max=sum%m;
                }
            }
               System.out.println(max);
        }
    }
}
