package JavaEclipseCode;//Q.20 WAP to find sum of first N natural number

import java.util.Scanner;
class SumOfFirstNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("sum of first "+n+"  natural number is: "+sum);
	}
}
