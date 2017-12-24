package sort;

public class MergeSort {
	/**
	 * 归并排序，时间复杂度O(nlog2n)，空间复杂度O(1)
	 */
	public static void sort(int[] array) {
		int[] temp = new int[array.length];
    	internalMerge(array, temp, 0, array.length - 1);
    }
	
	public static void internalMerge(int[] array,int[] temp, int start, int end) {
		if (start >= end) return;
		int mid = (start + end) / 2;
		internalMerge(array, temp, start, mid);
		internalMerge(array, temp, mid + 1, end);
		merge(array, temp, start, mid, end);
	}
	
	public static void merge(int[] array, int[] temp, int low, int mid, int height) {
		int i = low, j = mid + 1;
		int k = 0;
		while (i <= mid && j <= height) {
			if (array[i] <= array[j]) {
				temp[k++] = array[i++];
				
			} else {
				temp[k++] = array[j++];
			}
		}
		while (i <= mid) {
			temp[k++] = array[i++];
		}
		while (j <= height) {
			temp[k++] = array[j++];
		}
		System.arraycopy(temp, 0, array, low, k);
	}
}
