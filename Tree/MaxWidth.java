package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidth {
    static void maxWidth(Node root){
        if(root == null)return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int max=0;
        while(!q.isEmpty()){
            int sum=0;
            int count=q.size();
            for(int i=0;i<count;i++){
                Node temp=q.poll();
                if(temp.left!=null){
                    q.add(temp.left);
                    sum++;
                }
                if(temp.right!=null){
                    q.add(temp.right);
                    sum++;
                }
            }
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        maxWidth(root);
    }
}
