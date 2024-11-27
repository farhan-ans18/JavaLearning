package com.Algorithm;

public class LinkedList {

	class Node{
		Node preLink;
		int data;
		Node nextLink;
	}
	Node first = null;
	void insertAtFirst(int element ) {
		Node newNode = new Node();
		newNode.preLink = null;
		newNode.data = element;
		newNode.nextLink = null;
		
		if(first == null) {
			first = newNode;
		}
		else {
			newNode.nextLink = first;
			first.preLink = newNode;
			first = newNode;
		}
	}
	
	void insertAtlast(int element) {
		Node newNode = new Node();
		newNode.preLink = null;
		newNode.data = element;
		newNode.nextLink = null;
		
		if(first == null) {
			first = newNode;
		}
		else if(first.nextLink == null) {
			first.nextLink = newNode;
			newNode.preLink = first;
		}
		else {
			Node temp = first;
			while(temp.nextLink != null) {
				temp = temp.nextLink;
			}
			temp.nextLink = newNode;
			newNode.preLink = temp;
		}
	}
	
	void deleteFirst() {
		if(first == null) {
			System.out.println("Delete not Possible!");
		}
		else if(first.nextLink == null) {
			System.out.println("Element deleted is " + first.data);
			first = null;
		}
		else {
			System.out.println("Element deleted is " + first.data);
			first = first.nextLink;
			first.preLink = null;
		}
	}
	
	void deleteLast() {
		if(first == null) {
				System.out.println("Delete not possible!");
		}
		else if(first.nextLink == null) {
			System.out.println("Element deleted is " + first.data);
			first = null;
		}
		else {
			Node temp = first;
			while(temp.nextLink.nextLink != null) {
				temp = temp.nextLink;
			}
			temp = null;
		}
	}
	
	void displayForward() {
		if(first==null) {
			System.out.println("Displaying not Possible");
		}
		else if(first.nextLink == null) {
			System.out.println(first.data);
		}
		else {
			Node temp = first;
			while(temp != null) {
				System.out.println(temp.data);
				temp = temp.nextLink;
			}
		}
	}
}
