package com.step2gen.practice;

public class ChangeInWord {

	public static void main(String[] args) {
		int x = 4135;
		String str = Integer.toString(x);
		String temp = "";
		char[] arr = str.toCharArray();
		for(int i=0; i<arr.length; i++) {
		switch(arr[i]) {
		case '1' :
			temp+= "Ane";
			break;
		case '2' :
			temp+= "Bwo";
			break;
		case '3' :
			temp+= "Chree";
			break;
		case '4' :
			temp+= "Dour";
			break;
		case '5' :
			temp+= "Eive";
			break;
		case '6' :
			temp+= "Fix";
			break;
		case '7' :
			temp+= "Geven";
			break;
		case '8' :
			temp+= "Hight";
			break;
		
		case '9' :
			temp+= "Ine";
			break;
		}
		temp+= " ";
		}
		
		System.out.println(temp);
	}

}
