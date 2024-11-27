package com.Algorithm;

public class DemoBox<T> {
  T items;
  
  public void setItems(T items) {
	  this.items = items;
  }
  
  void display() {
	  System.out.println("Item is : " + items);
  }
}
