
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

	public void add(int data)
	{
		add(this.root, data);
	}

	private void add(BNode node, int data)
	{
		if (data < node.data)
		{
			if (node.left != null)
			{
				add(node.left, data);
			} else
			{
				System.out.println(data + " inserted to the left of node " + node.data);
				node.left = new BNode(data);
			}
		} else if (data > node.data)
		{
			if (node.right != null)
			{
				add(node.right, data);
			} else
			{
				System.out.println(data + " inserted to the right of node " + node.data);
				node.right = new BNode(data);
			}
		}
	}

	public boolean isFound(int searchData)
	{
		return isFound(this.root, searchData);
	}
	
	private boolean isFound(BNode node, int searchData)
	{
		if (node == null)
		{
			return false;
		}
		if (searchData == node.data)
		{
			return true;
		} else if (searchData < node.data)
		{
			return isFound(node.left, searchData);
		} else
		{
			return isFound(node.right, searchData);
		}
	}

	private void inOrder(BNode node)
	{
		if (node.left != null)
			inOrder(node.left);
		System.out.print(node.data + " ");
		if (node.right != null)
			inOrder(node.right);
	}

	// your homework
	private void preOrder(BNode node)
	{
		System.out.print(node.data + " ");
		if (node.left != null)
			preOrder(node.left);
		if (node.right != null)
			preOrder(node.right);
	}

	// your homework
	private void postOrder(BNode node)
	{
		if (node.left != null)
			postOrder(node.left);
		if (node.right != null)
			postOrder(node.right);
		System.out.print(node.data + " ");
	}

	public void inOrder()
	{
		this.inOrder(this.root);
	}
	
	public void preOrder()
	{
		this.preOrder(this.root);
	}
	
	public void postOrder()
	{
		this.postOrder(this.root);
	}

}
