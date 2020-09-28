package stringBST;
/*
 * Next:
 * 	implement data --> String		DONE!
 * 	fully encapsulate all classes	HW4U
 */

// implements here tells Java that this class can compare
// one of its objects to another object of the same class
// [ unsing the compareTo method, see near end of the code ]
public class BNodeStr implements Comparable<BNodeStr>
{
	BNodeStr left;
	String data;
	BNodeStr right;
	
	public BNodeStr(String data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public String toString()
	{
		return this.data;
	}
	
	public int compareTo(BNodeStr b)
	{
		return this.data.compareToIgnoreCase(b.data);
	}
	
}
