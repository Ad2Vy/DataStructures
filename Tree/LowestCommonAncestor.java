package Tree;
import java.util.*;

public class LowestCommonAncestor {
    static boolean findPath(Node root,ArrayList<Node> p,int n){
        if(root ==null)return false;
        p.add(root);
        if(root.key==n)return true;
        if(findPath(root.left,p,n)||findPath(root.right,p,n))return true;
        p.remove(p.size()-1);
        return false;
    }
    public static Node lca(Node root, int n1, int n2){
        ArrayList <Node> path1=new ArrayList<>();
        ArrayList <Node> path2=new ArrayList<>();
        if(!findPath(root, path1, n1) || !findPath(root, path2, n2))
            return null;
        for(int i=0;i<path1.size()-1 && i<path2.size()-1;i++)
            if(path1.get(i+1)!=path2.get(i+1))
                return path1.get(i);
        return null;
    }
    //optimized but only works if both are present in the tree.
    static Node LCA(Node root,int n1,int n2){
        if(root==null)return null;
        if(root.key==n1 || root.key==n2){
            return root;
        }
        Node lca1=LCA(root.left,n1,n2);
        Node lca2=LCA(root.right,n1,n2);
        if(lca1!=null && lca2!=null)
            return root;
        if(lca1!=null)
            return lca1;
        else
            return lca2;
    }


    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.right.right.right=new Node(8);

        Node cur=lca(root,4,8);
        assert cur != null;
        System.out.println(cur.key);
    }

}
