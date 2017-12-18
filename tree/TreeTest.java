package tree;

public class TreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub     // tree:  1
		TreeNode t = new TreeNode(1);          //      2    3
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
	    TreeUtil.PostOrderTraverse(t);
	    
	}

}
