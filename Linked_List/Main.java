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
}