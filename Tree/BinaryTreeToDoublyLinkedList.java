package Tree;

public class BinaryTreeToDoublyLinkedList {
    static Node prev=null;
    static Node binaryToDoubly(Node root){
        if(root == null) return null;
        Node head= binaryToDoubly(root.left);
        if(prev== null) head=root;
        else{
            prev.right=root;
            root.left=prev;
        }
        prev=root;
        binaryToDoubly(root.right);
        return head;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        TreeTraversal.inorder(root);
        System.out.println();

        Node cur= binaryToDoubly(root);
        while(cur!=null){
            System.out.print(cur.key+" ");
            cur=cur.right;
        }
    }
}
