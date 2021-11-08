package LinkedList;

class Node{
    int data;
    Node next;
    Node(int x){
        this.data=x;
        this.next=null;
    }
}
public class InsertAtBegin {
    static Node insert(Node head,int x){
        Node temp=new Node(x);
        temp.next=head;
        return temp;
    }

    public static void main(String[] args) {
        Node head=null;
        head=insert(head,30);
        head=insert(head,20);
        head=insert(head,10);
        head=insert(head,40);
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
