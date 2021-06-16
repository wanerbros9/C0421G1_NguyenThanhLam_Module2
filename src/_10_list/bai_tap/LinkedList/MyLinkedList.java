package _10_list.bai_tap.LinkedList;

public class MyLinkedList<E> {
    private Node next;
    private Object data;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData(){
        return this.data;
    }

    private Node head;
    private int numNodes=0;

    public MyLinkedList() {
    }

    public void addFirst(E element){
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element){
        Node temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public void add(int index, E element){
        Node temp = head;
        Node holder;
        for (int i =0;i<index-1&&temp.next!=null;i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next= new Node(element);
        temp.next.next = holder;
        numNodes++;
    }
}
