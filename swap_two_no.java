import java.util.*;
class swap_two_no
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number is A:");
		int a=s.nextInt();
		System.out.print("Enter the number is B:");
		int b=s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A is :"+a);
		System.out.println("B is :"+b);
	}
}