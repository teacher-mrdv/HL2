
public class BSTTest
{

	public static void main(String[] args)
	{
		// your code goes here
		BSTree myBST = new BSTree(5);
		System.out.println();
		myBST.add(myBST.root, 3);
		myBST.add(myBST.root, 9);
		myBST.add(myBST.root, 1);
		myBST.add(myBST.root, 4);
		myBST.add(myBST.root, 6);
		myBST.add(myBST.root, 10);
		myBST.add(myBST.root, 8);
		System.out.println();
		System.out.println("Is 9 in the tree? " +
				myBST.find(myBST.root, 9));
		System.out.println("Is 0 in the tree? " +
				myBST.find(myBST.root, 0));
		myBST.inOrder(myBST.root);
	}

}
