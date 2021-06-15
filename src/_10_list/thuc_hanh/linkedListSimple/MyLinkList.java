package _10_list.thuc_hanh.linkedListSimple;

import javax.xml.soap.Node;

public class MyLinkList {
    private Node head;
    private int numNodes;

    public MyLinkList(Object data){
        head = new Node(data) {
        }
    }
}
