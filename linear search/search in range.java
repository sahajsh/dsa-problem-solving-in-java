

import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// linear search in range
        int[] nums ={1,2,3,4,43};
        int target =4;
        System.out.println(linearSearch(nums,target,1,3));

	}
    static int linearSearch(int[] arr, int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i =start;i<=end;i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
 //output it will return index 3
