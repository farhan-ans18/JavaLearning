package array;

public class FirstRepeatating {

	public static void main(String[] args) {
		int[] arr = {6, 10, 5, 4, 9, 120, 4, 6, 10};
		int n = arr.length;
		
		int repeat = repeating(arr,n);
		System.out.println(repeat);

	}
	
	public static int repeating(int[] arr, int n) {
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]==arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}

}
