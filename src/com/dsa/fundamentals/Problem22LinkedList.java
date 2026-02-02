package com.dsa.fundamentals;

public class Problem22LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		list.addLast(50);
		//list.removeFirst();
		list.addAt(2, 25);
		list.removeAt(0);
		list.display();
		System.out.println("Reversed:");
		list.reverse();
		//list.get(0);
		

	}

}
class Node {
	int data;
	Node next;
	Node(int data){
		this.data=data;
		next=null;
	}
}

class LinkedList{
	Node head;
	
	
	void addFirst(int val) {
		Node node=new Node(val);
		node.next=head;
		head=node;
		
	}
	void addLast(int val) {
		Node node=new Node(val);
		if(head==null) {
			head=node;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=node;
	}
	void addAt(int ind,int val) {
		if(ind>=size()) {
			System.out.println("Index out of bounds exception");
		}
		int current=0;
		Node temp=head;
		while(current<ind-1) {
			temp=temp.next;
			current++;
		}
		Node post=temp.next;
		Node node=new Node(val);
		temp.next=node;
		node.next=post;
		
	}
	
	void removeFirst() {
		if(head==null) {
			System.out.println("No elements found in the list to remove");
		}
		Node temp=head.next;
		head.next=null;
		head=temp;
	}
	
	void removeLast() {
		if(head==null) {
			System.out.println("No elements found to remove");
		}
		Node pre=head;
		Node temp=head.next;
		while(temp.next!=null) {
			pre=temp;
			temp=temp.next;
		}
		pre.next=null;
	}
	void removeAt(int ind) {
		if(ind>=size()) {
			System.out.println("Index out of bounds exception");
		}
		else if(ind==0) {
			removeFirst();
		}
		Node pre=head;
		Node temp=head.next;
		Node post=temp.next;
		int current=0;
		while(current<ind-1) {
			pre=pre.next;
			current++;
		}
		temp=pre.next;
		post=temp.next;
		pre.next=post;
	}
	
	Node get(int ind) {
		if(ind>=size()) {
			System.out.println("Index out of bounds exception");
		}
		int count=0;
		Node temp=head;
		while(count!=ind) {
			temp=temp.next;
			count++;
		}
		return temp;
	}
	

	int size() {
		int size=0;
		Node temp=head;
		while(temp!=null) {
			temp=temp.next;
			size++;
		}
		return size;
		
	}
	
	void reverse() {
		int start=0;
		int end=size()-1;
		while(start<end) {
			Node left=get(start);
			Node right=get(end);
			Node temp=new Node(left.data);
			left.data=right.data;
			right.data=temp.data;
			start++;
			end--;
		}
		display();
	}
	
	void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}
}
