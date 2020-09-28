package stringBST;
/*
 * Next:
 * 	implement data --> String		DONE!
 * 	fully encapsulate all classes	HW4U
 */
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
