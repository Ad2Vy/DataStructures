package LinkedList;

public class InsertAtEnd {
    static Node insertAtEnd(Node head,int x){
        Node temp=new Node(x);
        Node cur=head;
        if(head == null){
            return temp;
        }
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=temp;
        return head;
    }

    static Node insertAtPosition(Node head,int pos,int data){
        int position=2;
        Node temp=new Node(data);
        if(pos==1){
            temp.next=head;
            return temp;
        }
        Node cur=head;
        while(cur!=null){
            if(pos==position){
                temp.next=cur.next;
                cur.next=temp;
                return head;
            }
            position++;
            cur=cur.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head=null;
        head=insertAtEnd(head,10);
        head=insertAtEnd(head,20);
        head=insertAtEnd(head,30);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        Node cur=head;
        head=insertAtPosition(head,4,40);
        System.out.println();
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }

    }
}
