package sort;

public class HeapSort {
    /**
     * 堆排序，时间复杂度O(nlog2n)，空间复杂度O(1)
     * 假设数组为满2叉数, i的左孩子：2*i+1，右孩子：2*(i+1)
     */
	public static  void sort(int[] array) {
		int len = array.length;
		for (int i = len / 2; i >= 0; i--) {  //除叶结点都接受调整
			heapAdjust(array, i, len - 1);
		}
		
		for (int j = len - 1; j > 0;) { //将最大数移动到末尾n，在将0~n-1最大调整到0
			swap(array, 0, j);
			heapAdjust(array, 0, --j);
		}
	}
	
	public static void heapAdjust(int[] array, int m, int n) {
		int father = array[m];
		int child = 2 * m + 1;
		for (; child <= n; child = child * 2 + 1) {  
			if (child < n && array[child] < array[child + 1]) child++;
			if (array[m] >= array[child]) break;  //找到最大结点与根结点交换，若没有则不用交换
			array[m] = array[child];
			m = child; //记录child越界前的叶结点
		}
		array[m] = father;
	}
	
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
