import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int data) {
        this.data = data;
    }

    TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

class Pair {
    TreeNode node;
    int freq;

    Pair(TreeNode node, int freq) {
        this.node = node;
        this.freq = freq;
    }
}

public class All3in1Traversal {

    public void preInPost(TreeNode root) {

        Stack<Pair> st = new Stack<Pair>();
        st.push(new Pair(root, 1));

        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        if (root == null) return;

        while (!st.isEmpty()) {
            Pair it = st.pop();

            if (it.freq == 1) {
                pre.add(it.node.data);
                it.freq++;
                st.push(it);

                if (it.node.left != null) {
                    st.push(new Pair(it.node.left, 1));
                }
            } else if (it.freq == 2) {
                in.add(it.node.data);
                it.freq++;
                st.push(it);

                if (it.node.right != null) {
                    st.push(new Pair(it.node.right, 1));
                }
            } else post.add(it.node.data);
        }
        System.out.println("Preorder: " + pre);
        System.out.println("Inorder: " + in);
        System.out.println("Postorder: " + post);

    }

    public static void main(String[] args) {
        All3in1Traversal trv = new All3in1Traversal();

//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);

//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.left.left = new TreeNode(3);
//        root.left.left.left = new TreeNode(4);

//        TreeNode root = new TreeNode(1);
//        root.right = new TreeNode(2);
//        root.right.right = new TreeNode(3);
//        root.right.right.right = new TreeNode(4);

//        TreeNode root = new TreeNode(1);

        TreeNode root = null;

        trv.preInPost(root);

    }
}
