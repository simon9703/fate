package practice;

public class Solution6 {
    /**
     * 输入一个整数，计算其存储时1的个数
     */
	public static int numberOf1I(int n) {
		int count = 0;
		while (n != 0) {
			n = n & (n - 1);   //去除一个最低位的1  ->  01100&01011 = 01000 
			count++;
		}
		return count;
	}
	
	public static int numberOf1II(int n) {
		int count = 0;
		int flag = 1;
		while (flag != 0) {
			if ((flag & n) != 0) count++;
			flag <<= 1;
		}
		return count;
	} 
	
	public static int numberOf1III(int n) {
		int count = 0;
		while (n != 0) {
			if ((n & 1) != 0) count++;
			n >>>= 1;                   // >>> 整体右移，不管符号位。 >> 右移最高位补符号位
		}
		return count;
	}
	
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		System.out.println(numberOf1I(5));
 	    System.out.println(numberOf1II(5));
        System.out.println(numberOf1III(5));
	}

}
