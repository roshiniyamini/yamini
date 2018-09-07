import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		try
		{
			Integer.parseInt(str);
			System.out.println("yes");
		}
		catch(NumberFormatException e)  
		{
			System.out.println("no");
		}
	}
}
