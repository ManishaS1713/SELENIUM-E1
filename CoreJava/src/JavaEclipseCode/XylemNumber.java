package JavaEclipseCode;//Q.45 Check whether the given number is XYLEM NUMBER or not (sum of mean digits== sum ofextreme digits)
// (34326 -> 3+6==4+3+2)

import java.util.Scanner;
class XylemNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		int n=num;
		int mean=0,extreme=0;
		while (n!=0)
		{
			int last=n%10;
			if (n==num || n<10)
			{
				extreme+=last;
			}
			else
			{
				mean+=last;
			}
			n/=10;
		}
		System.out.println("Extreme: "+extreme);
		System.out.println("Mean: "+mean);
		if (mean==extreme)
		{
			System.out.println(num+" is XYLEM NUMBER");
		}
		else
		{
			System.out.println(num+" is not XYLEM NUMBER");
		}
	}
}
