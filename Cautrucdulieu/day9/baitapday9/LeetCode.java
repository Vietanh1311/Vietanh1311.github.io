package baitapday9;

public class LeetCode {

    public static void main(String[] args) {
        LeetCode math = new LeetCode();
        TreeNode root = new TreeNode(5,new TreeNode(4,new TreeNode(11,new
        TreeNode(7),new TreeNode(2)),null),new TreeNode(8,new TreeNode(13),new
        TreeNode(4,null,new TreeNode(1))));
        

        System.out.println(math.hasPathSum(root, 8));
        System.out.println(math.maxDepth(root));
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);

    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int maxL = 0, maxR = 0;
        if (root.left != null) {
            maxL = maxDepth(root.left);
        }
        if (root.right != null) {
            maxR = maxDepth(root.right);
        }
        return maxL > maxR ? maxL + 1 : maxR + 1;

    }
}
