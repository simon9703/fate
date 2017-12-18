package search;

public class BinarySearch {
	/**
	 * 折半查找，mid = low + (height - low )/2
	 * 时间复杂度O(logn)，空间复杂度O(1)。
	 * @param data
	 * @param key
	 * @return
	 */
	public static int search(int[] data, int key) {
		int low = 0;
		int height = data.length - 1;
		int mid;
		while (low <= height) {
			mid = (low + height) / 2;
			if (data[mid] > key)
				height = mid - 1;
			else if (data[mid] < key)
				low = mid + 1;
			else 
				return mid;
		}
		return -1;
	}
}
