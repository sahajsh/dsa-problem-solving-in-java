//Swap values in an array->
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) 
	{
        int[] arr = {1,2,3,4};
        swap(arr, 1,3);

		System.out.println(Arrays.toString(arr));
	}
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2] = temp;

    }
}

[1, 4, 3, 2] is output
