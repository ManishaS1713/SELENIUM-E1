package JavaEclipseCode;//check if the number is NEON NUMBER (9;9*9=81;8+1=9)
class  NeonNumber
{
	public static void main(String[] args) 
	{
		int n=9;
		int p=n*n;
		int p1=p;
		int sum=0;
		int  cnt=0;
		while(p!=0)
		{
			int s=p%10;
			cnt++;
		}
		while(cnt>0)
		{
				int s1=p1%10;
				sum +=s1;
				System.out.println(sum);
				cnt--;
	}
	if (sum==n)
	{
		System.out.println("number is NEON no.");
	}
}
}