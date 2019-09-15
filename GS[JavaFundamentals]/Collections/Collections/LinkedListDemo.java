package Collections;

public class LinkedListDemo {

	public static void main(String[] args) 
	{
		LinkedListT a = new LinkedListT();
		a.addFirst(5);
		a.addFirst(6);
		a.addFirst(7);
		a.addFirst(8);
	
		a.display(a.head);
		
		System.out.println();
		a.reverse(a.head);
	}
}



class Node
{
	int data;
	Node next;

	public Node(int data) 
	{
		this.data=data;
		this.next=null;
	}

}

class LinkedListT
{
	public Node head;
	
	public LinkedListT()
	{
		head =null;
	}
	
	public void addFirst(int data)
	{
		Node n = new Node(data);
		n.next= head;
		head = n;
	}
	
	public void reverse(Node head)
	{
		Node current = head;
		Node prev =null; 
		Node next = null;
		
		while(current !=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
		System.out.println("Reverse");
		display(head);
	}
	public void display(Node head)
	{
		Node currNode = head;
		while(currNode!=null)
		{
			System.out.print("->" + currNode.data);
			currNode=currNode.next;
		}
	}
}
