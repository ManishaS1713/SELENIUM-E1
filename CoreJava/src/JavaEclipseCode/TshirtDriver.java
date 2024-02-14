package JavaEclipseCode;import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class Tshirt implements Comparable 
{
	String brand;
	int size;
	double price;
	Tshirt(String brand, int size, double price)
	{
		this.brand= brand;
		this.size= size;
		this.price= price;
	}
	@Override
	public String toString()
	{
		return "Brand: "+ brand +", Size: "+ size +", Price: "+ price;
	}
	//take unique price
	public boolean equals(Object o)
	{
		Tshirt temp=(Tshirt)o;
		if (this.price == temp.price)
		{
			return true;
		}
			return false;
	}

	public int hashCode()
	{
		return ((Double)price).hashCode();
	}

	// sort data as per price of Tshirt
	public int compareTo(Object o)
	{
		Tshirt temp=(Tshirt)o;
		if(this.price >temp.price)
		{
			return 1;
		}
		if (this.price < temp.price)
		{
			return -1;
		}
			return 0;

	}

}
class  TshirtDriver
{
	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		ts.add(new Tshirt("Adidas",42, 5000));
		ts.add(new Tshirt("Allen Solly",30, 1200));
		ts.add(new Tshirt("Cotten king",45, 1900));
		ts.add(new Tshirt("Local",32, 1200));

		System.out.println("output using for-each loop");
		for(Object o: ts)
		{
		System.out.println(o);
		}

		System.out.println("output using iterator");

		Iterator i= ts.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
