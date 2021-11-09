package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrder {

    static void levelO(Node root){
        if(root==null)
            return ;
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int count=q.size();
            for(int i=0;i<count;i++){
                Node cur=q.poll();
                System.out.print(cur.key+" ");

                if(cur.left!=null)q.add(cur.left);
                if(cur.right!=null)q.add(cur.right);
            }
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

        levelO(root);
        System.out.println("Hurray we did it");
    }
}
