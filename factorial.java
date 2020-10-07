import java.util.*;
class factorial
{
	public static void main(String args[])
	{
		int fact=1;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number:=");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.println(fact);
	}
}