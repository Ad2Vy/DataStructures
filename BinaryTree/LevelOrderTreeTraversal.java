package BinaryTree;

import java.util.LinkedList;

import java.util.Queue;

public class LevelOrderTreeTraversal  {
    static void levelOrderONE(Node root){
        if(root==null)
            return;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(queue.size()>1){
            Node node=queue.poll();
            if(node==null){
                queue.add(null);
                System.out.println();
                continue;
            }
            System.out.print(node.data+" ");
            if(node.left!=null)queue.add(node.left);
            if(node.right!=null)queue.add(node.right);
        }
    }


    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        levelOrderONE(root);
    }
}
