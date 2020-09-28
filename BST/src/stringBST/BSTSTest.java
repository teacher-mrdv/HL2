package stringBST;

public class BSTSTest
{

	public static void main(String[] args)
	{
		// your code goes here - HW
		BSTreeStr myBST = new BSTreeStr("Coffee");
		System.out.println();
		
		myBST.add("Tea");
		myBST.add("Milk");
		myBST.add("Soda");
		myBST.add("Lemonade");
		myBST.add("Water");
		myBST.add("Wine");
		myBST.add("Beer");
		System.out.println();
		System.out.println("Is Pepsi in the tree? " + myBST.isFound("Pepsi"));
		System.out.println("Is Wine in the tree? " + myBST.isFound("wine"));
		System.out.println("\nPre order traversal:");
		myBST.preOrder();
		System.out.println("\nIn order traversal:");
		myBST.inOrder();
		System.out.println("\nPost order traversal:");
		myBST.postOrder();
		
	}

}
