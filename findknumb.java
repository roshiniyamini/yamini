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
	       int K=s.nextInt();
	       boolean flag=false;
	       int a[]=new int[10];
	       for(int i=0;i<n;i++)
	       {
	       	 a[i]=s.nextInt();
	       }
	       for(int i=0;i<n;i++)
	       {
	         if(a[i]==K)	
                     {
                     	flag=true;
                     	break;
                     }	     
	       }
	       if(flag==true)
	       
	       	{
	       		System.out.println("Yes");
	       		
	       	}
	       	else
	       	{
	       		System.out.println("No");
	       	}
	       
	}
}
