package JavaEclipseCode;
//Q.51 WAP to declare and initialize an array in single line

class  ArrayDeclareInitializeSingleLine
{
	public static void main(String[] args) 
	{
		
		int [] ar={1,2,3,4,5}; //single line initialization
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(" a["+i+"] ="+ar[i]);
		}
	}
}
