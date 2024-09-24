public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(9);
        list.insertFirst(6);
        list.insertFirst(92);
        list.insertFirst(5);
        list.insertFirst(1);
        list.insertLast(10);
        list.insert(7, 3);
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        System.out.println(list.deleteFromIndex(2));

        list.display();
    }
}