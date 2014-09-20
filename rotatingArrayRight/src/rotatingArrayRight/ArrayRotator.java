package rotatingArrayRight;

//You have to rotate an n*n array right by 90 degree.

public class ArrayRotator {

	public static int[][] rotateRight(int[][] array) {
		
		int n = array.length;
		
		for (int level = 0; level < n/2; level++) {
			for (int segment = level; segment < n-1-level; segment++) {
				int top = array[level][segment];
				
				//top <- left
				array[level][segment] = array[n-segment-1][level];
				
				//left <- bottom
				array[n-segment-1][level] = array[n-level-1][n-segment-1];
				
				//bottom <- right
				array[n-level-1][n-segment-1] = array[segment][n-level-1];
				
				//right <- top
				array[segment][n-level-1] = top;
				
			}
		}
		
		return array;
	}
	
	public static void print(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String args[]) {
		System.out.println("This was the initial array.");
		int[][] array1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		print(array1);
		System.out.println("The rotated array looks like this:");
		rotateRight(array1);
		print(array1);
	}

	
}
