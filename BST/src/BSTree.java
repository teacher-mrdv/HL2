
public class BSTree
{
	BNode root;
	
	public BSTree(int data)
	{
		this.root = new BNode(data);
		System.out.printf("Buidling BST with root %d\n", data);
	}
	
	public boolean isEmpty()
	{
		return root == null;
	}
	
	public void add(BNode node, int data)
	{
		if( data < node.data )
		{
			if(node.left != null)
			{
				add(node.left, data);
			} else {
				System.out.println(data + " inserted to the left of node " + node.data);
				node.left = new BNode(data);
			}
		} else if( data > node.data)
		{
			if(node.right != null)
			{
				add(node.right, data);
			} else {
				System.out.println(data + " inserted to the right of node " + node.data);
				node.right = new BNode(data);
			}
		}
	}
	
	public boolean find(BNode node, int searchData)
	{
		if( node == null )
		{
			return false;
		}
		if( searchData == node.data )
		{
			return true;
		} else if( searchData < node.data )
		{
			return find(node.left, searchData);
		} else {
			return find(node.right, searchData);
		}
	}
	
	public void inOrder(BNode node)
	{
		if(node.left != null) inOrder(node.left);
		System.out.print(node.data + " ");
		if(node.right!= null) inOrder(node.right);
	}
	
	// your homework
	public void preOrder(BNode node)
	{
		
	}
	
	// your homework
	public void postOrder(BNode node)
	{
		
	}
	
	// write a test class for BSTree to test this
	
}
