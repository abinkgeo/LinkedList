
package linkedList;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> list=new MyLinkedList<>();

        list.insertionAtBeginning(10);
        list.insertionAtEnd(20);
        list.insertionAtEnd(30);
        list.insertionAtEnd(40);
        list.insertionAtEnd(50);
        list.display();
        System.out.println();
        System.out.println("Size= "+list.getSize());

        System.out.println();

        list.deleteFromBeginning();
        list.display();
        System.out.println();
        System.out.println("Size= "+list.getSize());


        list.deleteFromEnd();
        list.display();
        System.out.println();
        System.out.println("Size= "+list.getSize());

        System.out.println(list.search(20));
    }
}


