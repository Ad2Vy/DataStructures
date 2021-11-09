package Tree;

public class NodesInCompleteBinaryTree {
    static int naive(Node root){
        if(root==null){
            return 0;
        }
        return 1+ naive(root.left)+naive(root.right);
    }

    //Efficient as it checks for the completeness of the binary tree first and then switches to naive method
    static int countNodes(Node root){
        if(root==null)return 0;
        int lh=0,rh=0;
        Node cur=root;
        while(cur!=null){
            lh++;
            cur=cur.left;
        }
        cur=root;
        while(cur!=null){
            rh++;
            cur=cur.right;
        }
        if(lh==rh){
            return (int)Math.pow(2,(double)lh)-1;
        }
        return 1+countNodes(root.left)+countNodes(root.right);

    }


    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
//        root.right.right=new Node(7);
        /*
         *          1
         *         2    3
         *      4   5 6
         */

        System.out.println("No. of Nodes in the complete binary tree are: "+naive(root));
        System.out.println("With efficient solution: "+countNodes(root));
    }
}
