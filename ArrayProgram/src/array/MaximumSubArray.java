package array;

public class MaximumSubArray {

	public static void main(String[] args) {
		int[] arr = {2, 3, -8, 7, -1, 2, 3};
		int n = arr.length;
		int max = arr[0];
		for(int i=0; i<n; i++) {
			int sum = 0;
			for(int j=i; j<n; j++) {
				sum += arr[j];
				}
			if(sum>max) {
				max = sum;
			}
		}
		
		System.out.println(max);

	}

}
