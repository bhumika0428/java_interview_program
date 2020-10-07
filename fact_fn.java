import java.util.*;
class fact_fn
{
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:=");
		int num=s.nextInt();
		
		int factorical = fact(num);
		
		System.out.println("find the factorical number:"+factorical);
		
	}
	
	 static int fact(int n)
	{
		int output;
		if(n == 1)
		{
			return 1;
		}
		else
		{
			output=fact(n-1)*n;
			return output;
			
		}
	}
	
}
