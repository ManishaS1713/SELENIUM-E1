package JavaEclipseCode;//Q.41 Check if the number is STRONG NUMBER (145=1!+4!+5!)
//145=1+4*3*2*1+5*4*3*2*1=1+24+120=145

import java.util.Scanner;
class StrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		int copy=num;
		int sum=0;
		while(num>0)
		{
			int fact=1;
			int last=num%10;
			for(int i=1;i<=last;i++)
			{
				fact*=i;
			}
			sum+=fact;
			num/=10;
		}
		if(sum==copy)
		{
			System.out.println(sum+" is Strong Number");
		}
		else
		{
			System.out.println(sum+" is Not Strong Number");
		}
	}
}
