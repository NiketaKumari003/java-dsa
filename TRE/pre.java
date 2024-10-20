import java.util.*;
public class BinaryTreeB{
    static class Node{
        int data;
        Node left;
        Node right;
        
        
        // making of the constructor 
        Node(int data){
            this.data= data;
            this.left= null;
            this.right=null;
        }
    }
    
    //making class for Binary Tree
    static class BinaryTree{
        static int idx=-1;
        public static  Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode= new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right= buildTree(nodes);
            return newNode;
        }
        public static void preorder(Node root){
            if(root==null){
                return ;
            }
            System.out.println(root.data+"");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root= tree.buildTree(nodes);
    tree.preorder(root);
    }
}



java -cp /tmp/ZOD6ZFYPNR/BinaryTreeB
1
2
4
5
3
6