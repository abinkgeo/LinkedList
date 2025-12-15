package linkedList;

public class Queue<T> {

    private MyLinkedList<T> list;

    Queue(){
        list=new MyLinkedList<>();
    }

    public  void enqueue(T data){
        list.insertionAtEnd(data);
    }

    public T dequeue(){
        if(list.isEmpty()){
            System.out.println("Queue is Empty");
            return null;
        }
        T front=list.getFirst();
        list.deleteFromBeginning();
        return front;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public T front(){
            if(list.isEmpty()){
                System.out.println("Stack is Empty");
                return null;
            }
            T front=list.getFirst();
            return  front;
    }

    public void  display(){
        list.display();
    }


}
