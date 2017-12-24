package sort;

public class ShellSort {
	/**
	 * 希尔排序，时间复杂度O(nlog2n)，空间复杂度O(1)。
	 */
    public static void sort(int []array) {
    	int len = array.length;
    	for (int gap = len / 2; gap > 0; gap /= 2) { //选择增量，这里增量为n/2, n/2/2, ..., 1
    		for (int i = gap; i < len; i++) {        //开始快速排序
    			int insertNum = array[i];
    			int j = i - 1;
    			for (; j >= 0 && array[j] > insertNum; j--) {
    				array[j + 1] = array[j];
    			}
    			array[j + 1] = insertNum;
    		}
    	}
    }
    
    public static void sort2(int []array) {
    	int len = array.length;
    	for (int gap = len / 2; gap > 0; gap /= 2) {
    		for (int i = gap; i < len; i++) {        
    			int j = i;
    			while (j - gap >= 0 && array[j - gap] > array[j]) { 
    				int temp = array[j];
    				array[j] = array[j - gap];
    				array[j -gap] = temp;
    			}
    		}
    	}
    }
}
