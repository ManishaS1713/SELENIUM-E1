package JavaEclipseCode;//Q.44 Check whether the given number is SYP number(dig sum==dig prod)
//22=2+2=4 and 22=2*2=4

import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int num1=num;
		int sum=0;
		int product=1;
		while(num!=0)
		{
			int last=num%10;
			sum+=last;
			num/=10;
		}
		System.out.println("sum is "+sum);
		while(num1!=0)
		{
			int last1=num1%10;
			product*=last1;
			num1/=10;
		}
		System.out.println("product is "+product);
		 if(sum==product)
		{
			System.out.println("Number is SPY number ");
		}
		else
		{
			System.out.println("Numberis not SPY number");
		}
	}
}
