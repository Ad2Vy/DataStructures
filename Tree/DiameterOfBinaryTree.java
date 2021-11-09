package Tree;

public class DiameterOfBinaryTree {
    static int diameter(Node root){
        if(root==null)return 0;
        int d1=1+HeightOfABinaryTree.height(root.left)
        +HeightOfABinaryTree.height(root.right);
        int d2=diameter(root.left);
        int d3=diameter(root.right);

        return Math.max(d1, Math.max(d2,d3));
    }

    /**
     * now let's create a hashmap to optimize the above function
     * HashMap<Node, Integer>
     * HashMap will have Node and it's corresponding height.
     * so for every node we will have height for every node.
     * so it would make the height(operation easier).
     *
     * MORE EFF:
     * best way is to modify height function to set a result variable as diameter.
     * where   res=Math.max(res,1+lh+rh);
     *
     */
    static int res=0;
    static int diameterEff(Node root){
        if(root ==null){
            return 0;
        }
        int lh=diameterEff(root.left);
        int rh=diameterEff(root.right);
        res=Math.max(res,1+lh+rh);
        return 1+Math.max(lh,rh);
    }


    public static void main(String[] args) {
        /**
         *          1
         *        2     3
         *            4   6
         *           5
         */
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);

        root.right.left=new Node(4);
        root.right.left.left=new Node(5);
        root.right.right=new Node(6);

        System.out.println(diameter(root));
        System.out.println(diameterEff(root)+""+res);
    }

}
