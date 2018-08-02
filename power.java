
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int p=s.nextInt();
		int r=1;
		if(n>=0 && p==0)
		{
			r=1;
		}
		else if(n==0 && p>=0)
		{
			r=0;
		}
		else
		{
			for(int i=1;i<=p;i++)
			{
				r=r*n;
			}
			System.out.println(+r);
		}
		
	}
}
