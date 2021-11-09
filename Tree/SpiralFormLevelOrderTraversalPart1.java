package Tree;

import java.util.*;

public class SpiralFormLevelOrderTraversalPart1 {
    /**
     * first we have to print root then right to left
     * left to right
     * right to left
     * and so on...
     * for eg
     *            10
     *        20       30
     *     40   50   60  70
     *output= 10 30 20 40 50 60 70
     */
    static void spiral(Node root){
        if(root == null)return;
        Queue<Node> q=new LinkedList<>();
        Stack<Integer> s= new Stack<>();
        boolean reverse=false;
        q.add(root);
        while(!q.isEmpty()){
            int count=q.size();
            for(int i=0;i<count;i++){
                Node temp=q.poll();
                if(reverse){
                    s.push(temp.key);
                }
                else{
                    System.out.print(temp.key+" ");
                }
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
            }
            if(reverse){
                while(!s.isEmpty()){
                    System.out.print(s.pop()+" ");
                }
            }
            reverse=!reverse;
            System.out.println();
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

        spiral(root);

    }

}
