// Max value in an array ->
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr ={1,9,3,4,5};
        System.out.println(maxprog(arr));

	}
    static int maxprog(int[] arr){
         int max_value = arr[0];
      for(int i =1;i<arr.length;i++){
          if(arr[i] > max_value){
              max_value= arr[i];
          }
          
      }
      return max_value;
    }
}

/////////////////////////////  get maximum value in a range  //////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) 
	{
	   int[] arr = {1,2,77,466};
      System.out.println(maxval(arr,1,3));
	}
    static int maxval(int[] arr,int start,int end){
        int max_value = arr[0];
        for(int i =start;i<=end;i++){
            if(arr[i] > max_value){
                max_value= arr[i];
            }
        }
        return max_value;

    }
}

