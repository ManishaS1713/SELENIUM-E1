package JavaEclipseCode;//Q. 56.1) Bubble sort the following string array based on their length
//{"hi","your","you","program","hello"}
class  StringArrayBubbleSort
{
	public static void main(String[] args) 
	{
		String [] str={"hi","your","you","program","hello"};
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str.length-1;j++)
			{
				if(str[j].length()>str[j+1].length())
				{
					String temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted bubble string is:");
		for(String s:str)
		{
			System.out.println(s);
		}
	}
}
