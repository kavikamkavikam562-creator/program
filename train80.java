import java.util.*;
import java.lang.*;
import java.io.*;

class train80
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n-- > 0){
		    int a = sc.nextInt() , b = sc.nextInt();
		    int f = a - b;
		    int res = (b < f) ? b : f;
		    System.out.println(res);
		}
		

	}
}
