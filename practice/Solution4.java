package practice;

public class Solution4 {
	/**
	 * 给出一个非递减数组的旋转，找出最小元素，如{1 2 3 4 5} =旋转> {3 4 5 1 2}
	 */
    public static int minNumberInRotateArray(int[] array) {
    	int low = 0;
    	int height = array.length - 1;
    	int mid;
    	while (low < height) {
    		mid = (low + height) / 2;
    		if (array[mid] > array[height]) {
    			low = mid + 1;
    		} else if(mid == array[height]) {
				height = height - 1;
			}
    		else {
				height = mid;
			}
    	}
    	return array[low];
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] array = {1,1,1,0,1};
        System.out.println(minNumberInRotateArray(array));
	}

}
