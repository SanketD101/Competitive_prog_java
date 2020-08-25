package test;

import java.util.Scanner;

public class queue {
	static public Scanner sc = new Scanner(System.in);
	static int rear=-1,frount=-1,size=5;
    static int arr[] = new int[size];

	static void manage() {
		
		while(true) {
		System.out.print("1.insert   2.dequeue  3.exit");
		int num=sc.nextInt();
		switch(num) {
		case 1:
		       int item = sc.nextInt();
			      insert(item);
			    
			   break;
		case 2:
		case 3:System.exit(0);
		default:System.out.println("enter valide no..........!");
		}
	  }
	}
	static void insert(int item) {
	
		if(!isFull()){
			System.out.println("Overflow..........!");
		} 
	
		if(!isEmpty(item)) {
			frount++;
	  		rear++;
		}
	 	else{
			for(int i=0;i<size;i++) {
		        arr[i]=item;
			    rear++;	
	        }
		} 
	  }
	static boolean isFull() {
		if(rear == size-1)
			return true;
		else
			return false;
	}
	static boolean isEmpty(int item) {
		if(rear==-1 && frount==-1)
			return true;
		else
			return false;
	}
	
	
	public static void main(String[] args) {
		manage();
	}
}