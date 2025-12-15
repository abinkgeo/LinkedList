package linkedList;

import java.util.List;

public class Stack <T>{

   private MyLinkedList<T> list;

    public Stack(){
        list=new MyLinkedList<>();
    }

    public void push(T data){
        list.insertionAtBeginning(data);
    }
    public T pop(){

        if (list.isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }

        T top=list.getFirst();
        list.deleteFromBeginning();
        return top;

    }

    public T peek(){
        if(list.isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }

        T first=list.getFirst();
        return  first;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void display(){

        list.display();
    }

}
