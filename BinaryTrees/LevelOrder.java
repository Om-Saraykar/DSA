package BinaryTrees;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrder {
    static int n;
    public static void printNthLevel(TreeNode root, int k){
        if(root==null) return;
        if(n==k) System.out.print(root.val + " ");
        printNthLevel(root.left, k+1);
        printNthLevel(root.right, k+1);
    }
    public static void levelOrder(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            TreeNode front = q.remove();
            System.out.print(front.val + " ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
    }

    public static class Pair{
        TreeNode node;
        int level;

        public Pair(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }
    public static void levelOrderQueue(TreeNode root){
        int preLevel = 0;
        Queue<Pair> q = new LinkedList<>();
        if(root!=null) q.add(new Pair(root,0));

        while(q.size()>0){
            Pair front = q.remove();
            TreeNode temp = front.node;
            int lvl = front.level;
            if(lvl>preLevel){
                System.out.println();
                preLevel++;
            }
            System.out.print(temp.val + " ");
            if(temp.left!=null) q.add(new Pair(temp.left, lvl+1));
            if(temp.right!=null) q.add(new Pair(temp.right, lvl+1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);
        TreeNode i = new TreeNode(9);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.left = h; f.right = i;

        // printing tree in level order
        levelOrder(a);
        System.out.println();

        // printing nth level of the tree
        System.out.print("Enter level to print: ");
        n = sc.nextInt();
        printNthLevel(a, 0); // following 0 based indexing
        System.out.println();

        // printing tree using in level order (without using Queues)
        for(int x=0; x<=3; x++){
            n = x;
            printNthLevel(a, 0);
            System.out.println();
        }

        // printing tree in level order using Queues
        levelOrderQueue(a);
    }
}
