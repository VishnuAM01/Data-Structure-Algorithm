
package dsa;
/*Implementing stack using Array*/
import java.util.*;
public class Stack {
	int stack[], max_size, tos;
	
	//Creating stack
	private void create_stack(int size) {
		stack=new int[size];
		max_size=size-1;
		tos=-1;
		}
	//Checking the stack is empty or not
	private boolean isEmpty() {
		if(tos==-1)
			return true;
		else
			return false;
	}
	
	//Checking the stack is full or not
	private boolean isFull() {
		if(tos==max_size)
			return true;
		else
			return false;
	}
	
	//Inserting element into top of stack
	private void push(int n) {
		stack[++tos]=n;
	}
	
	//Removing element from top of stack
	private int pop() {
		return stack[tos--];
	}
	
	//Checking the element at top
	private int peek() {
		return stack[tos];
	}
	
	//Printing all the elements in the stack without removing the elements from stack
	private void printStack()
	{
		for(int i=tos;i>-1;i--)
			System.out.println(stack[i]);
	}
			
	public static void main(String[] args) {
		System.out.println("Enter the size of stack");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		//Instantiation of the statck
		Stack s= new Stack();
		s.create_stack(size);
		
		//User Interaction
		int choice;
		do {
			System.out.println("Choose the number regarding the operation:");
			System.out.println("\n1. PUSH \n2.POP \n3.PEEK \n4.isStackEmpty? \n5.isStackFull? \n6.PrintStack \n0.EXIT.!!");
			choice=sc.nextInt();
			switch(choice){
			case 1: if(s.isFull()!=true) {
				System.out.println("Enter the number: ");
				int num=sc.nextInt();
				s.push(num);
			}
			else
				System.out.println("Stack is FULL!!");
			break;
			
			case 2: if(s.isEmpty()!=true) {
				System.out.println(s.pop());
			}
			else
				System.out.println("Empty Stack");
			break;
			
			case 3: if(s.isEmpty()!=true) {
				System.out.println(s.peek());
			}
			else
				System.out.println("Empty Stack");
			break;
			
			case 4: if(s.isEmpty()!=false) {
				System.out.println("Empty Stack");
			}
			else
				System.out.println("Stack is not Empty");
			break;
			
			case 5: if(s.isFull()!=false) {
				System.out.println("Stack is Full");
			}
			else
				System.out.println("Stack is not Full");
			break;
			
			case 6: if(s.isEmpty()!=true) {
				s.printStack();
			}
			else
				System.out.println("Stack is Empty");
			break;
			
			case 0: System.out.println("Exiting the program. Thank you.");
			break;
			
			default : System.out.println("Enter a valid choice.!!");
			break;
			}
			
		}while(choice!=0);
		
		sc.close();
	}

	

}
