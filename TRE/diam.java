import java.util.*;

class BinaryTreeB {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }

    public int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);
        int currentDiameter = leftDiameter + rightDiameter + 1;

        return Math.max(currentDiameter, Math.max(leftDiameter, rightDiameter));
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int diameter = new BinaryTreeB().diameter(root);
        System.out.println("The diameter of the tree is: " + diameter);
    }
}


java -cp /tmp/JWcSFVebmA/BinaryTreeB
The diameter of the tree is: 5

=== Code Execution Successful ===