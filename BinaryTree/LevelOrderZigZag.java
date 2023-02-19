package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderZigZag {
    static void levelOrderZig(Node root){
        int count=0;
        if(root==null)return;
        Stack<Node> stack1=new Stack<>();
        Stack<Node> stack2=new Stack<>();
        stack2.push(root);
        count++;
        while(true){
            Node node;
            if(count%2!=0){
                while(!stack2.isEmpty()){
                    node=stack2.pop();
                    System.out.print(node.data+" ");
                    if(node.left!=null)stack1.push(node.left);
                    if(node.right!=null)stack1.push(node.right);

                }
                System.out.println();
                count++;
            }
            else{
                while(!stack1.isEmpty()){
                    node=stack1.pop();
                    System.out.print(node.data+" ");
                    if(node.right!=null)stack2.push(node.right);
                    if(node.left!=null)stack2.push(node.left);
                }
                System.out.println();
                count++;
            }
            if(stack1.isEmpty()&&stack2.isEmpty()){
                return;
            }
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
        root.left.left.left=new Node(8);
        root.left.left.right=new Node(9);
        root.left.right.left=new Node(10);
        root.left.right.right=new Node(11);
        levelOrderZig(root);

    }
}
