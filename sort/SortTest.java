package sort;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a1 = {5, 4, 3, 2, 1, 5};
	     int[] a2 = {22, 55, 44, 11, 33, 22};
	     int[] a3 = {1, 2, 3, 4, 5};
	     
	     HeapSort.sort(a1);
	     HeapSort.sort(a2);
	     HeapSort.sort(a3);
	     System.out.println(Arrays.toString(a1));
	     System.out.println(Arrays.toString(a2));
	     System.out.println(Arrays.toString(a3));
	}

}
