package JavaEclipseCode;
//Q.73 WAP to find intersection of two arrays
//arr[1,2,3,4] frr[5,1,2,6]
//arrayintersection is: 1,2
import java.util.Arrays;
class  ArrayIntersection
{
	public static void main(String[] args) 
	{
		int []a={1,2,3,4,5,6};
		int []b={5,1,6,2,4};
		System.out.println("Original array: ");
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println("Intersection element of two arrays are: ");
		for (int i=0;i<a.length;i++ )
			{
				
				for(int j=0;j<b.length;j++)
				{
					if (a[i]==b[j])
					{
						System.out.print(" "+a[i]);
					}
				}
				
			}
		}
}