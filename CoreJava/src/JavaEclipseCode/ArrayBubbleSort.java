package JavaEclipseCode;
//Q.56 to sort array elementsusing Bubble sort
class  ArrayBubbleSort
{
	public static void main(String[] args) 
	{
		int [] ar={90,80,12,5,4,0};
		System.out.println("Original Array is: ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		System.out.println("Bubble sorted array is: ");
		//  Normal for loop

		/*for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}*/
		//for-each loop

		for(int el:ar)
		{
			System.out.println(el);
		}
	}
}
