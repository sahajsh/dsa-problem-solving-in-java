// merge two sorted arrays 
import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) 
	{
		    int[] a= {1,2,3,4};
        int[] b={5,6,7};
        int c_len = a.length+b.length;
        int[] c = new int[c_len];
        for(int i =0;i<a.length;i++){
               c[i] = a[i];
        }
        for(int i =0;i<b.length;i++){
             c[a.length+ i] = b[i];
        }
   
            System.out.println(Arrays.toString(c));
        
	}
}

