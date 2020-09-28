package stringBST;

public class BSTreeStr
{
	BNodeStr root;

	public BSTreeStr(String data)
	{
		this.root = new BNodeStr(data);
		System.out.printf("Buidling BST with root %s\n", data);
	}

	public boolean isEmpty()
	{
		return root == null;
	}

	public void add(String data)
	{
		BNodeStr newNode = new BNodeStr(data);
		add(this.root, newNode);
	}

	private void add(BNodeStr node, BNodeStr data)
	{
		if (data.compareTo(node) < 0)
		{
			if (node.left != null)
			{
				add(node.left, data);
			} else
			{
				System.out.println(data + " inserted to the left of node " + node.data);
				node.left = data;
			}
		} else if (data.compareTo(node) > 0)
		{
			if (node.right != null)
			{
				add(node.right, data);
			} else
			{
				System.out.println(data + " inserted to the right of node " + node.data);
				node.right = data;
			}
		}
	}

	public boolean isFound(String searchData)
	{
		BNodeStr search = new BNodeStr(searchData);
		return isFound(this.root, search);
	}
	
	private boolean isFound(BNodeStr node, BNodeStr search)
	{
		
		if (node == null)
		{
			return false;
		}
		if (search.compareTo(node) == 0)
		{
			return true;
		} else if (search.compareTo(node) < 0)
		{
			return isFound(node.left, search);
		} else
		{
			return isFound(node.right, search);
		}
	}

	private void inOrder(BNodeStr node)
	{
		if (node.left != null)
			inOrder(node.left);
		System.out.print(node.data + " ");
		if (node.right != null)
			inOrder(node.right);
	}

	// your homework
	private void preOrder(BNodeStr node)
	{
		System.out.print(node.data + " ");
		if (node.left != null)
			preOrder(node.left);
		if (node.right != null)
			preOrder(node.right);
	}

	// your homework
	private void postOrder(BNodeStr node)
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
