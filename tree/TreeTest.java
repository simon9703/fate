package tree;

public class TreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub     // tree:  1
	/*	TreeNode t = new TreeNode(1);          //      2    3
		TreeNode t2 = new TreeNode(2);         //     4 5  6 7
 		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		TreeNode t6 = new TreeNode(6);
		TreeNode t7 = new TreeNode(7);
		t2.left = t4; t2.right = t5;
		t3.left = t6; t3.right = t7;
	    t.left = t2; t.right = t3;
	    TreeUtil.PreOrderTraverse(t); System.out.println();
	    TreeUtil.InOrderTraverse(t); System.out.println();
	    TreeUtil.PostOrderTraverse(t);*/
	    
	    int[] pre = {1,2,4,7,3,5,6,8};
	    int[] in = {4,7,2,1,5,3,8,6};
	    TreeNode node = ReConstructBinaryTree.fromPreAndInOrder(pre, in);
	    TreeUtil.PreOrderTraverse(node); System.out.println();
	    TreeUtil.InOrderTraverse(node); System.out.println();
	    TreeUtil.PostOrderTraverse(node);
	}

}
