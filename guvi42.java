import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int compared = 0;
String s1="hello" ,s2="world";
    for (int i = 0; i<s1.length() && i<s2.length(); i++){
        int a = s1.charAt(i);
        int b = s2.charAt(i);
        if(a < b){
            compared = -1;
        }
        else if(a > b){
            compared = 1;
        }
    }
   

	}
}
