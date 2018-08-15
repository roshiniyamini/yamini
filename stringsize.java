import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     String str;
	     Scanner s=new Scanner(System.in);
	     str=s.nextLine();
         int i = 0;
         for(char c: str.toCharArray()) {
         i++;
      }
      System.out.println(i);
	}
}
