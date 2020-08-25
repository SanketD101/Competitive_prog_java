package test;

import java.util.Scanner;

public class stack1 {
	static Scanner sc = new Scanner(System.in);
	
	 static int ch,size,top=-1;
	 private static int arr [];
	 
	 stack1(int size){
		 arr = new int[size];
	 }
	
	 
	  static void choice(){
		 while(true) {
			System.out.println("1.push,2.pop,3.peek,4.traverse,5.exit"); 

//			System.out.println("");
//			System.out.println("");
//			System.out.println("");
//			System.out.println("");
				 
		System.out.print("Eneter your choice :");
		ch = sc.nextInt();
		switch(ch) {
		 case 1:
			int item;
			System.out.print("Enter no you want to insert :");
			item = sc.nextInt(); 
			push(item);
		    break;
		 case 2:pop();
		 	break;
		 case 3:
			 System.out.println("Top eliment of stack is   :"+arr[top]);
		 	break;
		 case 4:traverse();
		 	break;
		 case 5:System.exit(1);
		 default:System.out.println("invalide choice.....!"); 
		}
	   }
	}

	private static void push(int item) {
		if(stack1.isFull()) {
			System.out.println("Stack is Overflow.....!");
		}
		else {
			arr[++top]=item;
		}
		}
	private static void pop() {
		if(stack1.isEmpty()) {
			System.out.println("Stack is Underflow....!");
		}else {
			System.out.println("poped element is  :"+arr[top]);
			top--;
		}
	}
    static boolean isFull() {
		if(top==size-1) {
			return true;
		}
		else {
			return false;
		}
	}
	static boolean isEmpty() {
	 if(top == -1) {return true;}else {return false;}	
	}
	
	 static void traverse() {
		for(int i = top ; i>=0; i--){
			System.out.println(arr[i]); 
			} 
		}
	public static void main(String[] args) {
		System.out.print("enter size of array :");
		size = sc.nextInt();
	    stack1 st = new stack1(stack1.size);
		st.choice();
	}

}
