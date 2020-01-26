public class LinkedList  {

    Node head;

    class Node {
        int data;
        Node next;

        public Node(int d) { data = d; }
    }

    Node insertNode(LinkedList l, int d){
        Node end = new Node(d);
        end.next = null;

        if(l.head == null)
            l.head = end;

        else{
            Node temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = end;
        }

        return l.head;
    }

    Node deleteNode(LinkedList l, int d){
        if(l.head == null)
            return null;
        else if(l.head.data == d)
            return head.next;
        else{
            Node temp = l.head;

            while(temp.next != null){
                if(temp.next.data == d) {
                    temp.next = temp.next.next;
                }
                temp = temp.next;
            }
        }
        return l.head;
    }
}
