import java.util.*;
class leapyear
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int years=s.nextInt();
		if(((years % 4 == 0) && (years % 100!= 0)) || (years%400 == 0))		
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not leap year");
		}
	}
}
 