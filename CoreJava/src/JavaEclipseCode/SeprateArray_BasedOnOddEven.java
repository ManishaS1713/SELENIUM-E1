package JavaEclipseCode;//Q.71 in an array element seprate them based on odd number and even number
//e.g. [9,2,1,8,6] o/p is [9,1,2,8,6]

import java.util.Arrays;
class  SeprateArray_BasedOnOddEven
{
	public static void main(String[] args) 
	{
		int[] arr={9,2,1,8,6};
		int [] frr=new int[arr.length];
		int cnt=0;
		System.out.println("Original Array is: "+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				frr[cnt]=arr[i];
				cnt++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				frr[cnt]=arr[i];
				cnt++;
			}
		}
			System.out.println("Modified Array based on odd-even is: "+Arrays.toString(frr));
	}
}
