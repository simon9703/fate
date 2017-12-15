package sort;

public class BubbleSort {
	/**
	 * 冒泡排序, 从后向前选择最小的放在1~n-1位置。
	 * 时间复杂度O(n^2), O(1)。
	 * @param array
	 */
	public static void sort(int []array) {
		int temp;
		int len = array.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = len - 1; j > i; j--) {
				if (array[j] < array[j - 1]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
	}
}
