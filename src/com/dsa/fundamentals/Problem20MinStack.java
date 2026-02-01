package com.dsa.fundamentals;

public class Problem20MinStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=10;
		Staack stack=new Staack(size);
		stack.push(10);
		stack.push(12);
		stack.push(20);
		//stack.display();
		stack.displayMinStack();
	

	}

}

class Staack{
	int size;
	int arr[];
	int top;
	int minStack[];
	int minTop;
	Staack(int size){
		this.size=size;
		this.top=-1;
		this.arr=new int[size];
		this.minStack=new int[size];
		this.minTop=-1;
	}
	
	void push(int val) {
		if(top==size-1) {
			System.out.println("Stack is overflow");
		}
		arr[++top]=val;
		if (minTop == -1 || val <= minStack[minTop]) {
	        minStack[++minTop] = val;
	    }
	}
	void pop() {
		if(top==-1) {
			System.out.println();
			System.out.println("Stack is underflow");
		}
		if(minStack[minTop]==arr[top]) {
			minTop--;
		}
		top--;
	}
	void peek() {
		System.out.println(arr[top]);
	}
	void display() {
		for(int i=top;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	void displayMinStack() {
		for(int i=minTop;i>=0;i--) {
			System.out.println(minStack[i]);
		}
	}
}
