package JavaEclipseCode;//Q.24 WAP to find digital sum of the given number
//i/p=154 -> 1+5+4=10 is o/p 

import java.util.Scanner;
class  DigitalSum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter more than three digit number: ");
		int num=sc.nextInt();
		int sum=0;
		while(num!=0)
		{
			int temp=num%10;
			sum+=temp;
			num/=10;
		}

		System.out.println("Digitalsum is:- "+sum);
	}
}
