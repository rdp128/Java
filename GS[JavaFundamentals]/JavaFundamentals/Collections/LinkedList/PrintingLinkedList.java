package Collections.LinkedList;

public class PrintingLinkedList {

	public static void main(String[] args) 
	{
		
		Node<String> start = new Node<String>("Apple",
				 			 new Node<String>("Banana", 
				 			 new Node<String>("Cherry", null)));
				
		while(start!=null)
		{
			System.out.println(start.getValue());
			start=start.getNext();
		}
		
	}

}
class Node<E>
{
	private E value;
	private Node<E> next;

	public Node(E value, Node<E> next) 
	{
		this.value=value;
		this.next=next;
	}

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}
	
}
