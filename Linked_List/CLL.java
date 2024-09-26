public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
            tail.next = head;
        }
    }

    public void display() {
          Node node = head;
          do { 
              System.out.println(node.val);
              node = node.next;
          } while (node != head); 
    }

    public void delete(int val) {
         Node node = head;
         if(node == null) {
             return;
         }
            if(node.val == val) {
                head = head.next;
                tail.next = head;
                return;
            }
            while(node.next != head) {
                if(node.next.val == val) {
                    node.next = node.next.next;
                    return;
                }
                node = node.next;
            }
    }
}
