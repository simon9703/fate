package sort;

public class InsertSort {
	/**
	 * 插入排序,时间复杂度O(n^2),空间复杂度O(1)
	 * @param array
	 */
	public static void sort(int []array) {
		int insertNum;
		int len = array.length;
		for (int i = 0; i < len - 1; i++) {
			insertNum = array[i + 1];
			int j = i;
			while (j >= 0 && array[j] > insertNum) {
				array[j + 1] = array[j];
				j--;
			} //终止时位置j, j+1位置属于插入值。
			array[j + 1] = insertNum;
		}
	}
    
	public static void sort2(int []array) {
		int len = array.length;
		int temp;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (array[j - 1] > array[j]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
				else {
					break;//每次相当于有序的冒泡排序,不在小于时赐趟不在向前。
				}
			}
		}
	}
}
