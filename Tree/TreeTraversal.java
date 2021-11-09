package Tree;
//    INORDER      ,    PREORDER     ,   POSTORDER
// left root right , root left right , left right root
public class TreeTraversal {
    static void inorder(Node root){
        /*
         * InOrder traversal: left root right
         * definitely recursion.
         *  inroder(root)---> inorder(left)---->inprder(left)-->untilnullreached print key.
         */
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.key+" ");
        inorder(root.right);
    }
    //PreOrder traversal: root left right
    static void preorder(Node root){
        if(root== null){
            return;
        }
        System.out.print(root.key+" ");
        preorder(root.left);
        preorder(root.right);
    }

    //PostOrder traversal :  left right root
    static void postorder(Node root){
        if(root==null)
            return ;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.key+" ");
    }



    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        /*
        *               1
        *             /   \
        *            2     3
        *          /  \   /  \
        *         4    5 6    7
         */

        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);

    }
}
