package sort;

public class SelectSort {
	/**
	 * 选择排序，从前向后选最小的放在 1~n-1位置。
	 * 时间复杂度O(n^2), O(1)。
	 * @param array
	 */
	public static void sort(int []array) {
		int len = array.length;
		for (int i = 0; i < len - 1; i++) {
			int position = i;
			int key = array[i];
			for (int j = i + 1; j <= len -1; j++) {
				if (array[j] < key) {
					position = j;
					key = array[j];
				}
			}
			array[position] = array[i];
			array[i] = key;
		}
	}
	
}
