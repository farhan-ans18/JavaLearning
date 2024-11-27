package array;



public class JaggedArray {

	public static void main(String[] args) {
//		int[][] marks = new int[3][];
//		marks[0] = new int[2];
//		marks[1] = new int[3];
//		marks[2] = new int[4];
//		
//		marks[0][0] = 55;
//		marks[0][1] = 65;
//		marks[1][0] = 75;
//		marks[1][1] = 85;
//		marks[1][2] = 45;
//		marks[2][0] = 35;
//		marks[2][1] = 25;
//		marks[2][2] = 15;
//		marks[2][3] = 95;
		
		  int[][] marks = {
				  {1,2,3},
				  {1,2},
				  {3,4,5,6,7}
		  };
		
		for(int i=0; i<marks.length; i++) {
			for(int j=0; j<marks[i].length; j++) {
				System.out.print(marks[i][j] + " ");
			}
			System.out.println();
		}
	}

}
