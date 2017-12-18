package tree;

public class TreeUtil {
	 public static void PreOrderTraverse(TreeNode node) {
		 if (node == null) return;
		 System.out.print("  " + node.data);
		 PreOrderTraverse(node.left);
		 PreOrderTraverse(node.right);
	 }
	 
	 public static void InOrderTraverse(TreeNode node) {
		 if (node == null) return;
		 InOrderTraverse(node.left);
		 System.out.print("  " + node.data);
		 InOrderTraverse(node.right);
	 }
	 
	 public static void PostOrderTraverse(TreeNode node) {
		 if (node == null) return;
		 PostOrderTraverse(node.left);
		 PostOrderTraverse(node.right);
		 System.out.print("  " + node.data);
	 }
}
