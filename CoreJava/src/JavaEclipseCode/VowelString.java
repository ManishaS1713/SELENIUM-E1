package JavaEclipseCode;//Q.85 count how many words start with vowel

import java.util.Scanner;
class  VowelString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sentence: ");
		String str=sc.nextLine().toLowerCase(); //use toLowerCase() convert user input into lower case to check the condition
		String [] ar=str.split(" ");
		int count=0;
		for (int i=0;i<ar.length ;i++ )
		{
			String temp=ar[i];
			char ch=temp.charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			count++;
		}
		}
			System.out.println("No. of vowels are: "+count);
	}		
}

/*OutPut:-
C:\Users\admin\Java1>java VowelString
Enter sentence:
I have an Apple
No. of vowels are: 3*/