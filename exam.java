public class exam {
	public static void main(String[] args) {

	}
	public static int arrSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	public static int[] rowSums(int[][] arr2D) {
		int[] array = new int[arr2D.length];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = arrSum(arr2D[i]);
		}
		return array;
	}
	public static boolean isDiverse(int[][] arr2D) {
		int[] array = rowSums(arr2D);
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[j] == array[i]) {
					return false;
				}
			}
		}
		return true;
	}
}