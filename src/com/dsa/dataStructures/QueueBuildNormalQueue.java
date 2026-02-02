package com.dsa.dataStructures;


public class QueueBuildNormalQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=7;
		Queue queue=new Queue(size);
		queue.enQueue(7);
		queue.enQueue(9);
		queue.enQueue(16);
		queue.enQueue(29);
		queue.enQueue(23);
		queue.deQueue();
		queue.enQueue(27);
		queue.display();

	}

}

class Queue{
	int size;
	int arr[];
	int front;
	int rear;
	Queue(int size){
		this.size=size;
		this.arr=new int[size];
		this.front=0;
		this.rear=-1;
	}
	void enQueue(int val) {
		if(rear==size-1) {
			System.out.println("Queue is overflow");
		}
		arr[++rear]=val;
	}
	void deQueue() {
		if(front>rear) {
			System.out.println("Queue is underflow");
		}
		front++;
	}
	void peek() {
		if(front>rear) {
			System.out.println("No elements found");
		}
		System.out.println(arr[front]);
	}
	void display() {
		for(int i=front;i<=rear;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
