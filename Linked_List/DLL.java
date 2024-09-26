 public class DLL {


Node head;
 
public void insertFirst(int val) {
    Node node = new Node(val);
    node.next = head;
    node.prev = null;
    if (head != null) {
        head.prev = node;
    }
    head = node;
}

public void insertLast(int val) {
    Node node = new Node(val);
    Node last = null;
    while(head.next!= null){
        head = node.next;
        last = head;
    }

    if(last == null){
        head = node;
    }else {
        last.next= node;
        node.prev = last;
    }
}


/* if tail is given */

// public void insertLast(int val) {
//     Node node = new Node(val);
//     if (head == null) {
//         node.prev = null;
//         head = node;
//         return;
//     }
//     Node tail = head;
//     tail.next = node;
//     node = tail;
//     node.next = null;
// }

public void display() {
    Node node = head;
    Node last = null;
    while(node!= null) {
        System.out.print(node.val+ " --> ");
        last = node;
        node = node.next;
    }
    System.out.println("END");

    System.out.print("Printing in reverse order");
    while(last!= null){
        System.out.println(last.val + " <-- ");
        last = last.prev;
    }
    System.out.println("START");

}

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
