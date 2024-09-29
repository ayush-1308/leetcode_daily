public class Main {
    public static void main(String[] args) {
        LL list = new LL();


        {/* calling single linked list here */}

        // list.insertFirst(9);
        // list.insertFirst(6);
        // list.insertFirst(92);
        // list.insertFirst(5);
        // list.insertFirst(1);
        // list.insertLast(10);
        // list.insert(7, 3);
        // System.out.println(list.deleteFirst());
        // System.out.println(list.deleteLast());
        // System.out.println(list.deleteFromIndex(2));

        {/* calling double linked list here */}

        DLL newList = new DLL();
        newList.insertFirst(9);
        newList.insertFirst(5);
        newList.insertFirst(6);
        newList.insertFirst(43);
        newList.insertFirst(34);

        list.display();
    }

    public static LL merge(LL list1, LL list2){
        Node first = list1.head;
        Node second = list2.head;

        LL mergedList = new LL();

        while(first!= null && second!= null){
            if(first.val < second.val){
                mergedList.insertLast(first.val);
                first = first.next;
            }
            else{
                mergedList.insertLast(second.val);
                second = second.next;
            }
        }
        while(first!= null){
            mergedList.insertLast(first.val);
            first = first.next;
        }
        while(second!= null){
            mergedList.insertLast(second.val);
            second = second.next;
        }

        return mergedList;
    }
}