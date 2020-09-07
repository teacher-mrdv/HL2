
public class BNode
{
	BNode left;
	int data;
	BNode right;
	
	public BNode(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public String toString()
	{
		return Integer.toString(this.data);
	}
	
}
