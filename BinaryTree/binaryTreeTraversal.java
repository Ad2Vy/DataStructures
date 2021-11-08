package BinaryTree;

public class binaryTreeTraversal {
    //Inorder traversal::  left root right
    static void inorder(Node root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //pre:: root left right
    static void preorder(Node root ){
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    //postorder: left right root
    static void postorder(Node root){
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }


    public static void main(String[] args) {

        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);

        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);

     }
}
