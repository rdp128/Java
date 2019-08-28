package Tree;

public class BinarySearchTree
{
     
    public static void main(String[] args) 
    {
    	BST a = new BST();
    	a.insertKey(10);
    	a.insertKey(20);
    	a.insertKey(21);
    	a.insertKey(8);
    	a.insertKey(6);
    	a.insertKey(16);
    	a.insertKey(23);
    	a.insertKey(2);
    	a.insertKey(13);
    	
    	System.out.println("Printing In order");
    	a.printInOrder();
    	System.out.println("Printing pre order");
    	a.printPreOrder();
    	System.out.println("Printing post order");
    	a.printPostOrder();
    	System.out.println("Min");
    	a.printMin();
	}
}

class BST
{
	Node root;
	public BST() {
	   this.root=null;
	}
	public void insertKey(int key)
	{
		root = insert(key, root);
	}
	public Node insert(int key , Node root)
	{
		if(root==null)
		{
			root=new Node(key);
			return root;
		}
		else if(key>root.data)
		{
			root.right=insert(key, root.right);
		}
		else if(key<root.data)
		{
			root.left=insert(key, root.left);
		}
		return root;
	}
	
	public void printInOrder()
	{
		inOrder(root);
		
	}
	
	public void printPreOrder()
	{
		//preOrder(root);
	}
	
	public void printPostOrder()
	{
		//postOrder(root);
	}
	
	public void printMin()
	{
		findMin(root);
	}
	
	public void inOrder(Node root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
		
	}
	
	public void preOrder(Node root)
	{
		if(root!=null)
		{
			System.out.println(root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public void postOrder(Node root)
	{
		if(root!=null)
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.data);
		}
	}
	int flag=0;
	public void findMin(Node root)
	{
		if(root.right!=null)
		{
			findMin(root.right);
			System.out.println(root.right.data);	
		}
	}
	
}

class Node
{
	int data;
	Node left;
	Node right;
	public Node(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}


