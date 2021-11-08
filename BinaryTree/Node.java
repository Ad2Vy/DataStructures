package BinaryTree;


public class Node {
    int data;
    Node left;
    Node right;
    Node(int key){
        this.data=key;
        this.left=null;
        this.right=null;
    }
}

class testNode{
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        System.out.print(""+root.data+""+root.right.data+""+root.left.data);
    }
}
