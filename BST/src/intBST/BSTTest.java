package intBST;

public class BSTTest
{

	public static void main(String[] args)
	{
		// your code goes here - HW
		BSTree myBST = new BSTree(5);
		System.out.println();
		
		myBST.add(3);
		myBST.add(9);
		myBST.add(1);
		myBST.add(4);
		myBST.add(6);
		myBST.add(10);
		myBST.add(8);
		System.out.println();
		System.out.println("Is 9 in the tree? " + myBST.isFound(9));
		System.out.println("Is 0 in the tree? " + myBST.isFound(0));
		System.out.println("\nPre order traversal:");
		myBST.preOrder();
		System.out.println("\nIn order traversal:");
		myBST.inOrder();
		System.out.println("\nPost order traversal:");
		myBST.postOrder();
		
	}

}
