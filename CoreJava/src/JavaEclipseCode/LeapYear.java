package JavaEclipseCode;import java.util.Scanner;
class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Year: ");
		int l=s.nextInt();
		if (l%400==0)
		{
			System.out.println("Century Leap Year");
		}
		else
		{
			System.out.println("Not Century Leap Year");
		}
	}
}