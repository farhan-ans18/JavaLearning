package array;

public class FindPeakElement {

	public static void main(String[] args) {
		int[] arr = {1, 3, 20, 4, 1, 0};
		int n = arr.length;
		int peak = findPeakElement(arr, n);
		System.out.println("The Peak element is " + peak);
		
	}
	
	public static int findPeakElement(int[] arr, int n) {

	if(n==1) {
		return arr[0];
	}
	
	if(arr[0] >= arr[1]) {
		return arr[0];
	}

		for(int i=1; i<n-1; i++) {
			if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]) {
				return arr[i];
			}
		}
		if(arr[n-1] >= arr[n-2]) {
			return arr[n-1];
		}
		
 return -1;
	}

}
