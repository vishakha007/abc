package abc;

public class BinaryTreeNode {

    public int value;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(int value) {
        this.value = value;
    }

    public BinaryTreeNode insertLeft(int leftValue) {
        this.left = new BinaryTreeNode(leftValue);
        return this.left;
    }

    public BinaryTreeNode insertRight(int rightValue) {
        this.right = new BinaryTreeNode(rightValue);
        return this.right;
    }
    
    public static Integer findLargest(BinaryTreeNode rootNode) {
        if (rootNode == null) { 
            throw new IllegalArgumentException("Tree must have at least 1 node");
        }
        if (rootNode.right != null)  {
            return findLargest(rootNode.right);
        }
        return rootNode.value;
    }

    public static Integer findSecondLargest(BinaryTreeNode rootNode) {
        if (rootNode == null ||
                (rootNode.left == null && rootNode.right == null)) {
            throw new IllegalArgumentException("Tree must have at least 2 nodes");
        }

        // case: we're currently at largest, and
        // largest has a left subtree
        // 2nd largest is largest in said subtree
        if ((rootNode.left != null) && (rootNode.right == null)) {
            return findLargest(rootNode.left);
        }

        // case: we're at parent of largest,
        // and largest has no left subtree
        // so 2nd largest must be current node
        if (rootNode.right != null
                && rootNode.right.left == null
                && rootNode.right.right == null) {
            return rootNode.value;
        }

        // otherwise: step right
        return findSecondLargest(rootNode.right);
    }
}
