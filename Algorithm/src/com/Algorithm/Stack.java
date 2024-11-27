package com.Algorithm;

public class Stack{
	private int[] s;
	private int size;
	private int top = -1;
	
	public Stack(int size) {
		if(size>0) {
		this.size = size;
		int[] s = new int[size];
		System.out.println("Stack of size " + size + " is created");
		}
	}
	
	public void  push(int element) {
		if(top < s.length) {
			s[top] = element;
			top++;
		}else {
			System.out.println("Stack is full");
		}
	}
	
	public void pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
		}else {
			s[top] = 0;
			top--;
		}
	}
	
	public void display() {
		for(int i=top; i>=0; i--) {
			System.out.println(s[i]);
		}
	}
}

