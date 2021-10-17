

import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] nums ={1,2,3,4,5,6,-2,9};
        System.out.println(min(nums));
	}
    static int min(int[] arr){
        int mini= arr[0];
        for(int i =1;i<arr.length;i++){
            if(mini >arr[i]){
                mini =arr[i];
            }

        }
        return mini;
    }
}

//-2 is output
