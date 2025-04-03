public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int find(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return i;
			}
		}
		return -1;
	}
	
	public static int findLast(String[] arr, String word) {
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i].equals(word)) {
				return i;
			}
		}
		return -1;
	}

	public static int findSecond(char[] arr, char letter) {
		int counter = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == letter) {
				if (counter == -1) {
					counter = i;
				} else {
					return i;
				}
			}
		}
		return counter;
	}
}