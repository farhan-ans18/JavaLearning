package com.Algorithm;

public class ArrayImplementation {
    private int[] arr;
    private int size;
	public ArrayImplementation(int size) {
		super();
		this.size = size;
		if(size>0) {
			arr = new int[size];
			System.out.println("An Array of " + size + " is created");
		}
		else {
			System.out.println("Give a valid array size in positive number start from 1");
		}
	}
	
	public void insert(int index, int element) {
		if(index >=0 && index < size) {
			arr[index] = element;
			System.out.println("Element " + element + " is inserted at index " + index);
		}
		else {
			System.out.println("Give a valid index from 0 to " + (size-1));
		}
	}
	
	public void delete(int index) {
		if(index >=0 && index < size) {
			System.out.println("Element " + arr[index] + " is deleted from index " + index);
			arr[index] = 0;
		}
		else {
			System.out.println("Give a valid index from 0 to " + (size-1));
		}
	}
	
	void display() {
		System.out.print("[");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]);
			if(i< size-1) {
				System.out.print(",");
			}
		}
		
		System.out.println("]");
	}
	
    int length() {
		return size;
	}
    
    public int binarySearch(int key) {
    	// sorting
    	sort();
    	int low = 0;
    	int high = size-1;
    	
    	while(low<=high) {
    		int mid = low + (high - low) / 2;
    		
    		if(arr[mid] == key) {
    			return mid;
    		}else if(arr[mid] < key) {
    			low = mid+1;
    		}
    		else {
    			high = mid-1;
    		}
    	}
    	
    	return -1;
    }
    
    public void sort() {
    	for(int i=1; i<size; i++) {
    		int item = arr[i];
    		int j = i-1;
    	 while(j>=0 && arr[j] > item) {
    		 arr[j+1] = arr[j];
    		 j--;
    	 }
    	 
    	 arr[j+1] = item;
    	}
    }
    
    
}
