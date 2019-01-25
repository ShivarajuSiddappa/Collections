package com.collections.arraylist;
public class LinkedListInternal {
	Node root;
	int size;
	
	public LinkedListInternal() {
		root = new Node();
		size = 0;
	}
	
	// Test code - main function
	public static void main(String[] args) {
		LinkedListInternal ll = new LinkedListInternal();
		System.out.println("Initail Size :"+ll.getSize());
		ll.add(8);
		System.out.println("After Adding First Size :"+ll.getSize());
		ll.add(17);
		ll.add(5);
		ll.add(10);
		System.out.println("Added some elements are :"+ ll.getSize());
		System.out.println("Finding / Searching the Element {17} : "+ll.find(17).getData());
		ll.remove(5);
		System.out.println("After Removed {5} in List Size:"+ll.getSize());
		System.out.println("Removed Element searching {5}:"+ll.find(5));
	}
	
	public void setSize(int s) {
		this.size = s;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public Node add(int data) {
		Node newNode = new Node(data, root);
		this.root = newNode;
		this.size++;
		return newNode;
	}
	
	public Node find(int data) {
		Node thisNode = this.root;
		
		while (thisNode != null) {
			if (thisNode.getData() == data)
				return thisNode;
			thisNode = thisNode.getNextNode();
		}
		return null;
	}
	
	public boolean remove(int data) {
		Node thisNode = this.root;
		Node prevNode = null;
		
		while (thisNode != null) {
			if (thisNode.getData() == data) {
				if (prevNode != null)
					prevNode.setNextNode(thisNode.getNextNode());
				else
					this.root = null;
				this.setSize(this.getSize()-1);
				return true;
			}
			prevNode = thisNode;
			thisNode = thisNode.getNextNode();
		}
		return false;
	}
	
	// Node class
	private class Node {
		private Node nextNode;
		private int data;

		// 0-arg constructor, 1-arg constructor, 2-arg constructor
		private Node() { }
		
		private Node(int val) {
			data = val;
		}
		
		private Node(int val, Node next) {
			data = val;
			nextNode = next;
		}
		
		
		// setter & getter for member variables
		private void setData(int val) {
			this.data = val;
		}
		
		private int getData() {
			return this.data;
		}
		
		private void setNextNode(Node n) {
			this.nextNode = n;
		}
		
		private Node getNextNode() {
			return this.nextNode;
		}
	}
}