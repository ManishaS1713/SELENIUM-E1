package JavaEclipseCode;/*
Q.7
*****
*@***
*****
*****
***!*
*/
class TrickySquare1
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=n ;j++ )
			{
				if (i==2 && j==2)
				{
					System.out.print("@ ");
				}
				else if (i==n && j==n-1)
				{
					System.out.print("! ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
