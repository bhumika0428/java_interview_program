class prime_no
{
	public static void main(String args[])
	{
		int n=9;
		int temp=0;
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println("not prime number");
		}
		else
		{
			System.out.println(" prime number");
		
		}
	}
}