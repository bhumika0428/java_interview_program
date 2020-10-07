import java.util.*;
class leapyear
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Entre the year :=");
		int year=s.nextInt();
		
		if((0 == year % 4) &&( 0 == year % 100)||( 0 == year % 4000))
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not leap year");
		}
	}
}

