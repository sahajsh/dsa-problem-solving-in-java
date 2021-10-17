
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String name ="sahaj";
        char target = 'r';
        System.out.println(search(name,target));
	}
    static boolean search(String str, char target){
        if(str.length() ==0){
            return false;
        }
        for(int i =0;i<str.length();i++){
        if(target == str.charAt(i)){
            return true;
        }
        }
        return false;
    }
}

output is false
//-----------------------------------------------using for each loop----------------------------------------------------------------------
	
	
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) 
	{
		//linear search in string 
        String name = "sahaj";
        char target = 'q';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search(name,target));
	}
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch: str.toCharArray() ){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}

//output-
	//[s, a, h, a, j]
       //   false
