package JavaEclipseCode;//WAP to find p^n

import java.util.Scanner;

class PowerOf 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int p=sc.nextInt();
		System.out.println("Enter power");
		int n=sc.nextInt();
		int result=1;
		for( int i=1; i<=n;i++)
		{
			result*=p;
			
		}
		System.out.println("p^n is "+result);
	}
}

//2*2*2=2^3
