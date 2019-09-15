package Stack;


/* Insertion and deletion at the top of stack only.
 * Initially when stack is empty top=-1
 * Push: Element pushed. Increase top by 1.Store it in array
 * 		 Check Overflow(full)
 * POP: Element at the position top is popped and then top is decreased by 1
 *      Check Underflow(empty)
 *       
 * DISPLAY: If top >=0 then display from top using decreased for loop
 *          Else Empty 
 */
import java.util.Scanner;

public class StackImplementUsingArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Push or Insert");
		System.out.println("2. Pop or Delete");
		System.out.println("3. Display");
		System.out.println("4. End Program");
		int ch;
		sc.close();
		
		StackMethod stack = new StackMethod();
		
		while(true)
		{
			System.out.println("Enter Choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				{
					stack.push();
					break;
				}
				case 2:
				{
					stack.pop();
					break;
				}
				case 3:
				{
					stack.display();
					break;
				}
				case 4:
				{
					System.out.println("Program ended");
					System.exit(0);
				}
				default:
				{
					System.out.println("Invalid choice");
				}				
			}			
		}
	}
    
}
class StackMethod
{
	int top=-1;
	int MAX=5;
	int a[]= new int [MAX];
	
	Scanner sc = new Scanner(System.in);
	
	public void push()
	{
		
		if(top==MAX-1)
		{
			System.out.println("Overflow or Stack is full");
		}
		else
		{
			System.out.println("Enter Element");
			int data = sc.nextInt();
			System.out.println("Enter Element to be pushed:" + data + "\n");
			top++;
			a[top]=data;
		}
	}
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Underflow or Stack is Empty");
		}
		else
		{
			System.out.println("Elemeent removed:" + a[top] +"\n");
			top--;
		}
	}
	
	public void display()
	{
		if(top>=0)
		{
			System.out.println("Elements:");
			for(int i=top; i>=0; i--)
			{
				System.out.println(a[i]);
			}
		}
		else
		{
			System.out.println("Stack is empty");
		}
	}
}
