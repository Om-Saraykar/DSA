package BinaryTrees;

public class Implementation {

    // display all elements
    private static void displayTree(TreeNode root){
        if(root==null) return;
        System.out.print(root.val + " ");
        displayTree(root.left);
        displayTree(root.right);
    }

    // sum of all elements
    public static int sumOfNodes(TreeNode root){
        if(root==null) return 0;
        return root.val + sumOfNodes(root.left) + sumOfNodes(root.right);
    }

    // product of non-zero elements
    public static int productOfNodes(TreeNode root){
        if(root==null) return 1;
        if(root.val==0) return productOfNodes(root.left) * productOfNodes(root.right);
        else return root.val *  productOfNodes(root.left) * productOfNodes(root.right);
    }

    // find the maximum value
    public static int maxNode(TreeNode root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(maxNode(root.left), maxNode(root.right)));
    }

    // find the minimum value
    public static int minNode(TreeNode root){
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(minNode(root.left), minNode(root.right)));
    }

    // find no. of levels
    public static int noOfLevels(TreeNode root){
        if(root==null) return 0;
        return 1 + Math.max(noOfLevels(root.left), noOfLevels(root.right));
    }

    // size of the tree
    public static int size(TreeNode root){
        if(root==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    // height of the tree
    public static int treeHeight(TreeNode root){
        return noOfLevels(root) - 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.left.left =  new TreeNode(2);
        root.left.right = new TreeNode(6);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(5);

        displayTree(root);
        System.out.println();
        System.out.println(sumOfNodes(root));
        System.out.println(productOfNodes(root));
        System.out.println(minNode(root));
        System.out.println(noOfLevels(root));
        System.out.println(treeHeight(root));
        System.out.println(size(root));
    }
}

//      1
//   4     3
// 2  6      5