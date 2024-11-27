package array;

public class MaximumProduct {

	public static void main(String[] args) {
		int[] arr = {-2, 6, -3, -10, 0, 2};
		int n = arr.length;
		maximumProduct(arr,n);
	}
	
	public static void maximumProduct(int[] arr, int n) {
		int max = arr[0];
		for(int i=0; i<n; i++) {
			int product = 1;
			for(int j=i; j<n; j++) {
				product *= arr[j];
				if(product > max) {
					max = product;
				}
			}
		}
		System.out.println("The subarray with maximum product is: " + max);
	}

}
