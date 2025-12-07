import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double y = sc.nextDouble();
		
		if (x % 5 == 0 && x + 0.50 <= y) {
		    y -= (x + 0.50);
		}
		System.out.printf("%.2f\n", y);
		

	}
}
