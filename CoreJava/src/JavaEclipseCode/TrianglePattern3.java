package JavaEclipseCode;/*
Q.5
    *
   **
  ***
 ****
*****
*/
class TrianglePattern3
{
	public static void main(String[] args) 
	{
		for (int i=0;i<5 ;i++ ) //for new row
		{
			for (int j=5-i;j>=1 ;j-- ) //for space print
			{
				System.out.print(" ");
			}
			for (int j=0;j<i ;j++ ) //for * print
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
