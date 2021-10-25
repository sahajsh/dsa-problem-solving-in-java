//find element in array solution print index-
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
       for(int i =0;i<arr.length;i++){
           arr[i] = sc.nextInt();
       }
       int find = sc.nextInt();
       int index =-1;
       for(int i =0;i<arr.length;i++){
           if(find == arr[i] ){
               index = i;
               break;
           }
       }
       System.out.println(index);
	}
}

search element in an array and return index .
  input-4
  1 2 3 4
  4
  //output
   3
