package array;

public class SubarrayWithZeroSum {

	public static void main(String[] args) {
		int[] arr = {-3, 2, 3, 1, 6};
		int n = arr.length;
		boolean isZero = false;
		for(int i=0; i<n; i++) {
			int sum = 0;
			for(int j=i; j<n; j++) {
				sum += arr[j];
				if(sum == 0) {
				  isZero = true;
				}
			}
		}
		System.out.println(isZero);
	}

}
