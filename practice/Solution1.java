package practice;

public class Solution1 {
	/**
	 * 给定数组：左->右增加，上->下增加，问是否包含xx
	 * 从左下角开始遍历，向上递减，向右递增
	 * @param array
	 * @param key
	 * @return
	 */
    public static boolean solute(int[][] array, int key) {
    	int row = array.length - 1;
    	int col = 0;
    	while (row >=0 && col < array[0].length) {
    		if (array[row][col] == key) {
    			System.out.println(String.format("array[%d][%d] = %d", row, col, key));
    			return true;
    		} 
    		else if (key < array[row][col])
    			row--;
    		else
    			col++;
    		
    	}
    	return false;
    }
    
    public static void main(String[] args) {
    	int[][] a = {{1,2,3,4,5}, {11,22,33,44,55}, {111,222,333,444,555}};
    	System.out.println(solute(a, 222));
    }
}
