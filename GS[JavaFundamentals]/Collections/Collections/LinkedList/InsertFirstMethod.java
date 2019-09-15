package Collections.LinkedList;

import java.util.LinkedList;

public class InsertFirstMethod {

	public static void main(String[] args) 
	{
		
		LinkedListMethod<String> list = new LinkedListMethod<>(); // Head null
		list.insertFirst("Banana"); // Banana null
		list.insertFirst("HI");
		list.insertLast("Mango");
		list.insertFirst("Cherry");
		System.out.println(list);
		
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("1");
		ll.add("2");
		ll.add("3");
		list.reverse(ll);
		
		
		System.out.println("\nReverse");
		list.reverse(ll);
		
		System.out.println("After deleting first value");
		list.deleteFirst();
		System.out.println(list);
		
		System.out.println("After deleting last value");
		list.deleteLast();
		System.out.println(list);
		
	}
}

class LinkedListMethod<E>
{
	private Node1 head;
	private Node1 current;
	private Node1 previous;
	private Node1 incoming;
	
	//Insert at fist
	public void insertFirst(E value)
	{
		Node1<E> newNode = new Node1<E>(value,null);

		if(head == null)
		{
			head=newNode;
		}
		else
		{
			newNode.setNext(head);
			head=newNode;
		}
	}
	//insert at Last
	public void insertLast(E value)
	{
		Node1<E> newNode = new Node1<E>(value,null);
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			current= head;
			while(current != null)
			{
				previous=current;
				current=current.getNext();
			}
			previous.setNext(newNode);
		}
	}
	//reverse
	
	public void reverse(LinkedList<String> ll)
	{
		Node1<E> current= head;
		Node1<E> previous = null;
		Node1<E> incoming = null;
		
		current=head;
		
		while(current!=null)
		{
			incoming=current.getNext();
			//current= current.getNext();
			previous=current.getNext();
			
			current=incoming;	
		}
		head=previous;
		
		
	}
	//deleate last
	public void deleteLast()
	{
		if(head!=null)
		{
			current= head;
			while(current.getNext() != null)
			{
				previous=current;
				current=current.getNext();
			}
			previous.setNext(null);
		}
	}
	//deleate First
	public void deleteFirst()
	{
		
		if(head!=null)
		{
			head= head.getNext();
		}
	}
	
	public String toString()
	{
		String output = "";
		current=head;
		while(current != null)
		{
			output += current.getValue() + " ";
			current = current.getNext();
		}
		return output;
	
	}
	
}
class Node1<E>
{
	private E value;
	private Node1<E> next;
	
	//Constructor
	public Node1(E value, Node1<E> next) {this.value=value; this.next=next;}
	
	//Getter and Setter Method
	  public E getValue() {return value;}
	  public Node1<E> getNext() {return next;}
	
	  public void setValue(E v) {value = v;}
	  public void setNext(Node1<E> n) {next = n;}
}