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

    public  void insertAtPosition(T data, int position){

        if(position<=0){
            System.out.println("Invalid postition");
            return;
        }

        if(position==1){
            insertionAtBeginning(data);
            return;
        }

        Node <T> temp=head;

        for(int i=1;i<position-1;i++){

            if (temp == null) {
                System.out.println("Position out of range");
                return;
            }
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        Node<T> newNode = new Node<>(data);
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void deleteFromBeginning(){
        if(head==null){
            System.out.println("List is empty");
            return ;
        }
        head=head.next;
        size--;
    }

    public  void delete(T data){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if(head.data.equals(data)){
            head=head.next;
            return;
        }
        Node<T> temp=head;

        while (temp.next != null && !temp.next.data.equals(data)) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Element not found");
            return;
        }

        temp.next = temp.next.next;

    }

    public void deleteFromPosition(int position) {

        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        Node<T> temp = head;
        for (int i = 1; i < position - 1; i++) {
            if (temp.next == null) {
                System.out.println("Position out of range");
                return;
            }
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Position out of range");
            return;
        }
        temp.next = temp.next.next;
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
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("null");
    }


}



