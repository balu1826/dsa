package com.dsa.dataStructures;
//for dynamic stack , copy all the elements into a new array when the length touches size and increase size by 2 times in push method 
public class Stack_BuildNormalStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=5;
		Stack stack=new Stack(size);
		stack.push(2);
		stack.push(5);
		stack.push(10);
		stack.pop();
		stack.push(8);
		stack.display();
		//stack.peek();

	}

}

class Stack{
	int size;
	int arr[];
	int top;
	Stack(int size){
		this.size=size;
		this.top=-1;
		this.arr=new int[size];
	}
	
	void push(int val) {
		if(top==size-1) {
			System.out.println("Stack is overflow");
		}
		arr[++top]=val;
	}
	void pop() {
		if(top==-1) {
			System.out.println();
			System.out.println("Stack is underflow");
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
}