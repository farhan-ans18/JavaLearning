package Practice;

import java.util.Scanner;

public class TcsP1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 10;
		
//		int sum = 0;
//		int num = 1;
//        while(a>0) {
//        	if(num%n==0) {
//        		sum +=num;
//        		a--;
//        	}
//        	num++;
//        }
		
//		int sum = 0;
//		for(int i=1; i<=a; i++) {
//			sum += n*i;
//		}
		
		
		int sum = n * (a*(a+1))/2;
		
		
		System.out.println(sum);
	}

}
