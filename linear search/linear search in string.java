
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
