package linkedList;



public class MyLinkedList<T> {
    private Node<T> head;

    int size=0;


    public void insertionAtBeginning(T data){
        Node<T> newNode=new Node<T>(data);
        newNode.next=head;
        head=newNode;
        size++;
    }


    public void insertionAtEnd(T data){
        Node<T> newNode=new Node<>(data);

        if(head==null){
            head=newNode;
            size++;
            return;
        }

        Node<T> temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        size++;
    }


    public void deleteFromBeginning(){
        if(head==null){
            System.out.println("List is empty");
            return ;
        }
        head=head.next;
        size--;
    }

    public void deleteFromEnd(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        while(head.next==null){
            head=null;
            size--;
            return;
        }

        Node <T> temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        size--;
    }

    public  boolean search(T key){


        Node<T> temp=head;
        while(temp!=null){
            if(temp.data.equals(key)){
                return  true;
            }
            temp=temp.next;
        }
        return false;
    }


    public boolean isEmpty(){

        return head==null;
    }

    public T getFirst(){
        if(head==null){
            System.out.println("List is empty");
        }

        return head.data;
    }

    public int getSize() {
        return size;
    }

    public void display(){
        Node<T> temp=head;

        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }


}



