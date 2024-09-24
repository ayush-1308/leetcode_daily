public class LL {
    
    private Node head;
    private Node tail;
    private int size;
    
    public LL() {
        this.size=0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int value) {
        if(tail == null){
           insertFirst(value);
           return;
        }
         Node node = new Node(value);
         tail.next = node;
         tail = node;

         size += 1;
         
    }

    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        } else if(index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
            for(int i = 1; i< index; i++){
                temp = temp.next;
            }

        Node node = new Node(value, temp.next);
        temp.next = node;

        size += 1;
        }

        public int deleteFirst(){
            int value = head.value;
            
            head = head.next;
            if(head == null){
                tail = null;
            }
            size --;
            return value;
        }

        public int deleteFromIndex(int index){
            if(index == 0){
                return deleteFirst();
            }
            if(index == size - 1){
                return deleteLast();
            }
            Node prev = head;
            for(int i = 1; i < index -1; i++){
                prev = prev.next;
            }
            int value = prev.next.value;
            prev.next = prev.next.next;
            return value;
        }

        public int deleteLast(){
            if(size <= 1){
                return deleteFirst();
            }
            Node temp = head;
            for(int i = 1; i< size-1; i++){
                temp = temp.next;
            }
            int value = tail.value;
            tail = temp;
            tail.next = null;
            size --;
            return value;
        }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        } 
        System.out.println("END");
    }
    
    private class Node{
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
  }
}
