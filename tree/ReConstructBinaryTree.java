package tree;

public class ReConstructBinaryTree {
	/**
	 * 给定前序{1,2,4,7,3,5,6,8}和中序{4,7,2,1,5,3,8,6}，生成二叉树。
	 * @param pre
	 * @param in
	 * @return
	 */
	public static TreeNode fromPreAndInOrder(int[] pre, int[] in) {
		return fromPreAndInOrder(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}
	
	public static TreeNode fromPreAndInOrder(int[] pre ,int startPre, int endPre,
			int[] in, int startIn, int endIn) {
		if(startPre > endPre || startIn > endIn) return null;
		
		TreeNode node = new TreeNode(pre[startPre]);//前序中第一个值为二叉树根节点
		for (int i = startIn; i <= endIn; i++) {
			if (in[i] == pre[startPre]) { //中序得到左右两子树 i - startIn 为做子树结点数
				// pre分割： (除去startPre)startPre + 1 ~ endPre ; in分割:startIn~ (除去i) ~ endIn
			node.left  = fromPreAndInOrder(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
			node.right = fromPreAndInOrder(pre, startPre + i - startIn + 1, endPre, in, i + 1, endIn);
			}
		}
		return node;
	}
}
