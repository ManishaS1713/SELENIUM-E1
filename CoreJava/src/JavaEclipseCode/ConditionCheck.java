package JavaEclipseCode;/* WAP to print
				a. "HI" when number is divisible by 3
				b. "BYE" when number is divisibleby 5
				c. "HiBye" when number is divisible by 3 and 5
				d. Number in rest of the cases
*/

import java.util.Scanner;

class ConditionCheck 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		if (num%3==0 && num%5==0)
		{
			System.out.println("Hi Bye");
		}
		else if (num%3==0)
		{
			System.out.println("HI");
		}
		else if (num%5==0)
		{
			System.out.println("BYE");
		}
		
		else 
		{
			System.out.println(num+" is not divisible by 3 or 5");
		}

	}
}
