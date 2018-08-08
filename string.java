import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	      String orig, rev="";
                  int i, len;
                  Scanner s= new Scanner(System.in);
                  orig = s.nextLine();
                  len = orig.length();
                  for(i=len-1; i>=0; i--)
                 {
                    rev = rev + orig.charAt(i);
                  }
	  
                 System.out.println(rev);
     }
}
