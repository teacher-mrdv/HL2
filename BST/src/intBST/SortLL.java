package intBST;

import java.util.*;	// to use Java's LinkedList class - https://www.javatpoint.com/java-linkedlist

public class SortLL
{

	static LinkedList<Integer> sorted = new LinkedList<>();
	
	private static void inOrder(BNode node)
	{
		if (node.left != null)
			inOrder(node.left);
		sorted.add(node.data);
		if (node.right != null)
			inOrder(node.right);
	}	
	
	public static void main(String[] args)
	{
		LinkedList<Integer> llist = new LinkedList<>();
		llist.add(7); llist.add(4); llist.add(2); llist.add(5);
		llist.add(1); llist.add(9); llist.add(6); llist.add(3);
		System.out.println("Linked list: " + llist + "\n");
		Iterator<Integer> list = llist.iterator(); // this is just so that we can use .hasNext()
		// list.resetNext() // pseudocode only
		BSTree bst = new BSTree( list.next() ); // list.getNext() in pseudocode
		while( list.hasNext() )
		{
			bst.add( list.next() ); // list.getNext() in pseudocode
		}
		inOrder(bst.root);
		System.out.println("\nSorted linked list: " + sorted);
	}

}
