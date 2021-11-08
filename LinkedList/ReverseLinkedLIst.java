package LinkedList;

/**
 * temp=head
 * 10->20->30->40->50->60
 */


public class ReverseLinkedLIst {

    static Node reverseLinked(Node head){
        Node prev=null;
        Node cur=head;
        while(cur!=null) {
            Node next = cur.next;
            cur.next=prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head=null;
        head=InsertAtBegin.insert(head,60);
        head=InsertAtBegin.insert(head,50);
        head=InsertAtBegin.insert(head,40);
        head=InsertAtBegin.insert(head,30);
        head=InsertAtBegin.insert(head,20);
        head=InsertAtBegin.insert(head,10);
        Node cur=head;
        while(cur!=null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
        Node curre=reverseLinked(head);
        Node curr=curre;
        while(curr!=null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }


    }

}
