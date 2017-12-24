package sort;

public class QuickSort {
	/**
	 * 时间复杂度O(nlog2n), 空间复杂度O(log2n)  不稳定排序
	 */
	public static void sort(int[] array) {
		quick(array, 0, array.length - 1);
	}
	
	public static void quick(int[]array, int start, int end) {
		if (start >= end) return;
		int mid = partion(array, start, end);
		quick(array, start, mid - 1);
		quick(array, mid + 1, end);
	 }
	 
	 public static int partion(int[] array, int low, int height) {
		int key = array[low];
		while (low < height) {
			while (array[height] >= key && low < height) {
				height--;
				break;
			}
			array[low] = array[height];
			while (array[low] <= key && low <height) {
				low++;
				break;
			}
			array[height] = array[low];	 
		}
		array[low] = key;
		return low;
	 }
}
