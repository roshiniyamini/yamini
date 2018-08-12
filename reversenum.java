
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int num, rev=0, rem;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
		
        while(num != 0)
        {
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
		
        System.out.print(rev);
    }
}
