package JavaEclipseCode;//Q.89 find the uppercase,lowercase,special character,digits in a String

import java.util.Scanner;
class  UpperLowerSpecialCase_String
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine(); //hi hello
		//String []ch=str.split(" "); //hi,hello
		char [] str1=str.toCharArray();
		int uCount=0, lCount=0, spCount=0, dCount=0;
		for (int i = 0; i < str1.length; i++) 
		{
			if (str1[i] >='A' && str1[i]<='Z')
			{
				uCount++;
			}
			if (str1[i] >='a' && str1[i]<='z')
			{
				lCount++;
			}
			if (str1[i] >='0' && str1[i]<='9')
			{
				dCount++;
			}
			else
			{
				spCount++;
			}
		}
		System.out.println("Upper Case Letters count: "+uCount +"\nLower Case Letters count: "+ lCount+"\nSpecial Character: "+ spCount +"\nDigits count: "+ dCount);
		
	}
}
