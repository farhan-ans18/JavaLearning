package array;

import java.util.Scanner;

public class ArmstrongP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 100;
		while(n>0) {
			if(isArmstrong(i)) {
				System.out.println(i);
				n--;
			}
			i++;
		}
		

	}
	
	public static boolean isArmstrong(int n) {
		String s = "" + n;
		int count = s.length();
		int temp = n;
		int sum = 0;
		while(temp>0) {
			int digit = temp%10;
			sum += (int)Math.pow(digit, count);
			temp /= 10;
		}
		
		if(sum==n) {
			return true;
		}else {
		return false;
		}
	}

}
