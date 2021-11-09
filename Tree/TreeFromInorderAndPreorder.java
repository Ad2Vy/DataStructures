package Tree;

import com.sun.source.tree.Tree;

public class TreeFromInorderAndPreorder {
    static int preIndex=0;
    static Node constructTree(int[] in,int[] pre,int is,int ie){
        if(is>ie)return null;
        Node root=new Node(pre[preIndex++]);
        int inIndex=0;
        //can be further optimized by hashing the key and value.
        for(int i=is;i<=ie;i++){
            if(in[i]==root.key){
                inIndex=i;
                break;
            }
        }
        root.left=constructTree(in,pre,is,inIndex-1);
        root.right=constructTree(in, pre,inIndex+1,ie);
        return root;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        int[] in={20,10,40,30,50};
        int[] pre={10,20,30,40,50};

        Node cur= constructTree(in,pre,0,in.length-1);
        TreeTraversal.inorder(cur);
    }
}
