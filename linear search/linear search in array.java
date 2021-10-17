
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//code for linear search 
        int[] nums = {1,2,3,5,44};
        int target = 2;
        int ans = linearSearch(nums,target);
        System.out.println(ans);

	}
    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i =0;i<arr.length;i++){
            int element = arr[i];
            if(element== target){
                return i;
            }
        }
        return -1;
    }
}

output is 1
