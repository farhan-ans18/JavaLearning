package array;

public class ArrayP1 {

	public static void main(String[] args) {
		int [] arr = {4,17,-5,-97,434};
        int resMax = resMax(arr);
        int resMin = resMin(arr);
        System.out.println(resMax);
        System.out.println(resMin);

	}
	public static int resMax(int[]arr){
        int max = arr[0];
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    
    public static int resMin(int[]arr){
        int min = arr[0];
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

}

