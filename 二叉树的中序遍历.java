import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class TreeNode {
	public int val;
	public TreeNode left, right;

	public TreeNode(int val) {
		this.val = val;
		this.left = this.right = null;
	}
}

public class Solution {
	/**
	 * @param root:
	 *            The root of binary tree.
	 * @return: Inorder in ArrayList which contains node values.
	 */
	public ArrayList<Integer> inorderTraversal(TreeNode root) {
		// write your code here
		Stack<TreeNode> stack = new Stack<>();
		ArrayList<Integer> arrayList = new ArrayList<>();
		Set<TreeNode> st = new HashSet<>();

		stack.push(root);

		while (!stack.isEmpty()) {
			TreeNode node = stack.peek();
			if (node == null) {
				stack.pop();

			} else {
				if (!st.contains(node)) {
					st.add(node);
					stack.push(node.left);
				} else {
					stack.pop();
					stack.push(node.right);
					arrayList.add(node.val);
				}
			}
		}

		return arrayList;
	}

	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		n1.right = n2;
		n2.left = n3;
		// n1.left = n4;

		Solution s = new Solution();
		s.inorderTraversal(n1);
	}
}
