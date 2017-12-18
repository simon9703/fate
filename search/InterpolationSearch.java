package search;

public class InterpolationSearch {
	/**
	 * 插值查找，按比例来，需要分布均匀。 mid = low + (key - data[low]) / (data[height] - data[low]) * (height - low) 
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
			mid = low + (int)(1.0 * (key - data[low]) / (data[height] - data[low]) * (height - low));
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
