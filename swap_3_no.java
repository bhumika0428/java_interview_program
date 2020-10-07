import java.util.*;
class swap_3_no
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of A :");
		int a=s.nextInt();
		System.out.println("Enter the number of B :");
		int b=s.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("A is :"+a);
		System.out.println("B is :"+b);
	}
}