package src.challenges;


public class SortArray {

	public static void main(String[] args) {

		// Array to be sorted
		int[] sortedArray = sortArrayOne(new int[] { 3, 4, 2, 1, 8, 9, 5, 6, 7, 10 });

		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}

	}

	public static int[] sortArrayOne(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					int b = array[j - 1];
					int a = array[j];
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		return array;
	}

	public static int[] sortArrayTwo(int[] array) {

		boolean flag = true;
		int temp = 0;
		while (flag) {
			flag = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;
					flag = true;
				}
			}
		}
		return array;
	}

}
