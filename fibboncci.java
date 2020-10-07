import java.util.*;
class fibboncci
{
	public static void main(String args[])
	{
		int n1=0,n2=1,c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=s.nextInt();
		System.out.println("N1:"+ n1 + " " +"N2:" +n2);
		for(int i=1;i<=n;i++)
		{
			c=n1+n2;
			System.out.println(c);
			n1=n2;
			n2=c;
		}
		//System.out.println(c);
	}
}