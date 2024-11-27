package com.Algorithm;
class Array {
	private int[] arr;
	private int size;
	
	public Array(int size) {
		if(size>0) {
		this.size = size;
		arr = new int[size];
		System.out.println("Array of size " + size + " is created");
		}else {
			System.out.println("Plz enter a valid size");
		}
		
	}
	public void insert(int index, int element) {
		if(index >= 0 && index < arr.length) {
			arr[index] = element;
		}else {
			System.out.println("plz enter a valid index");
		}
	}
	public void delete(int index) {
		if(index>=0) {
			arr[index] = 0;
		}
	}
	public void display() {
		for(int el : arr) {
			System.out.print(el + " ");
		}
	}
	
}

public class ArrayMethod {

	public static void main(String[] args) {
		Array arr = new Array(5);
		arr.insert(0, 5);
		arr.insert(1, 4);
		arr.insert(2, 3);
		arr.insert(3, 2);
		arr.insert(4, 1);
		arr.display();
		System.out.println();
		arr.delete(3);
		arr.display();

	}

}
