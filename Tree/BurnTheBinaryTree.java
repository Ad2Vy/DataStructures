package Tree;

class Distance{
    int val;
    Distance(int d){this.val=d;}
}

public class BurnTheBinaryTree {
    static int res=0;
    static int burnTree(Node root,int leaf,Distance dist){
        if(root == null)return 0;
        if(root.key==leaf){
            dist.val=0;return 1;
        }
        Distance ldist=new Distance(-1),rdist=new Distance(-1);
        int lh=burnTree(root.left,leaf,ldist);
        int rh= burnTree(root.right,leaf,rdist);
        if(ldist.val!=-1){
            dist.val=ldist.val+1;
            res=Math.max(res,rh+dist.val);
        }
        else if(rdist.val!=-1){
            dist.val=rdist.val+1;
            res=Math.max(res,dist.val+lh);
        }
        return Math.max(lh,rh)+1;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println(burnTree(root,5,new Distance(-1))+" "+res);
    }

}
