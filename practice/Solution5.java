package practice;

public class Solution5 {
    
	public static int fibonacci(int n) {
		if (n == 1) return 1;
		if (n == 2) return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	/**
	 * 青蛙一次跳1阶或2阶，求第n阶有多少种跳法
	 * 用2*1的小格子覆盖2*n个大格子有多少种方法
	 */
	public static int jumpFloor(int n) {
		if (n <= 2) return n;
		return jumpFloor(n - 1) + jumpFloor(n - 2);
	}
	
	/**
	 * 青蛙一次跳1阶或2阶...或n阶，求第n阶有多少种跳法
	 */
	public static int jumpFloor2(int n) {
		if (n == 1) return 1;
		return 2 * jumpFloor2(n - 1);  //归纳f(n) = f(n-1) ~ f(0) ; f(n-1) = f(n-2) ~ f(0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(jumpFloor2(1));
        System.out.println(jumpFloor2(2));
        System.out.println(jumpFloor2(3));
        System.out.println(jumpFloor2(4));
	}

}
