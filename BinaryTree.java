public class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTreeBuilder {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    // Preorder Traversal (Root -> Left -> Right)
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data); // Print root first
        preorder(root.left);          // Traverse left subtree
        preorder(root.right);         // Traverse right subtree
    }

    // Inorder Traversal (Left -> Root -> Right)
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);          // Traverse left subtree
        System.out.println(root.data); // Print root
        inorder(root.right);         // Traverse right subtree
    }

    // Postorder Traversal (Left -> Right -> Root)
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);         // Traverse left subtree
        postorder(root.right);        // Traverse right subtree
        System.out.println(root.data); // Print root last
    }

    // Count nodes in the tree
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);
        return leftNodes + rightNodes + 1; // Count root node + left and right subtrees
    }

    public static int sumNodes(Node root) {
        if (root == null) {
            return 0;
        }
        
        int leftNodes = sumNodes(root.left);
        int rightNodes = sumNodes(root.right);
        return leftNodes + rightNodes + root.data; // Count root node + left and right subtrees
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int myHeights = Math.max(leftHeight,rightHeight) +1;
         return myHeights;
    }
    public static int daimeter(Node root){
        if (root == null) {
            return 0;
        }
        int daim1 = daimeter(root.left);
        int daim2 = daimeter(root.right);
        int daim3 = height(root.left) + height(root.right) +1;
        return Math.max(daim3,Math.max(daim1,daim2));
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTreeBuilder treeBuilder = new BinaryTreeBuilder();
        Node root = treeBuilder.buildTree(nodes);

        // Preorder, Inorder, and Postorder Traversal:
        // System.out.println("Preorder Traversal:");
        // preorder(root);

        // System.out.println("\nInorder Traversal:");
        // inorder(root);

        // System.out.println("\nPostorder Traversal:");
        // postorder(root);

        // Count the nodes
        System.out.println("\nTotal Number of Nodes: " + countNodes(root));
        System.out.println(sumNodes(root));
        System.out.println( height(root));
        System.out.println(daimeter(root));
    }
}
