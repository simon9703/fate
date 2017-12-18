import java.util.Arrays;

import search.BinarySearch;
import sort.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a1 = {5, 4, 3, 2, 1, 5};
        int[] a2 = {22, 55, 44, 11, 33, 22};
        int[] a3 = {1, 2, 3, 4, 5};
     /*   InsertSort.sort(a1);
        InsertSort.sort(a2);
        InsertSort.sort(a3);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a3));*/
        System.out.println(BinarySearch.search(a3, 4));
	}

}
