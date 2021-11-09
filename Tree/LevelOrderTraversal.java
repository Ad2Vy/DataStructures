package Tree;


import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    // level order traversal means line by line or breadth first.
    static void level(Node root){
        if(root==null)return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(q.size()>1){
            Node curr=q.poll();
            if(curr==null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.key+" ");
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
        }
    }

    static void leverTraversal(Node root){
        if(root==null)return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        level(root);
    }
}
