
package linkedList;

public class Main {
    public static void main(String[] args) {

      Queue<Integer> queue=new Queue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);


        queue.display();
        System.out.println();
        System.out.println(queue.front());

        queue.dequeue();
        queue.dequeue();

        queue.display();
    }
}


