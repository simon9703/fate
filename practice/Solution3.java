package practice;

import java.util.Stack;

public class Solution3 {
	/**
	 * 用两个栈完成一个队列
	 */
	private Stack<Integer> stack1;
	private Stack<Integer> stack2; 
	
	public Solution3() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}
	
	public void push(int k) {
		stack1.push(k);
	}
	
	public int pop() {
		int temp ;
		if (stack2.isEmpty()) { //如果stack2不为空，说明已经遍历过stack2，stack2为队列顺序，暂且不管stack1。
			while (!stack1.isEmpty()) {   //江stack1进入stack2变为队列。
				temp = stack1.pop();
				stack2.push(temp);
			}
		}
		temp = stack2.pop();
		return temp;
	}
	
    public boolean isEmpty() {
    	if (stack1.isEmpty() && stack2.isEmpty()) return true;
    	return false;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Solution3 queue = new Solution3();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.pop());
        queue.push(4);
        queue.push(5);
        while (!queue.isEmpty()) {
        	 System.out.println(queue.pop());
        }
	}

}
