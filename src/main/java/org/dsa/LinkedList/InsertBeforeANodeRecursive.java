package org.dsa.LinkedList;

public class InsertBeforeANodeRecursive {

    static class Node{
        Node next;
        int data;
        public Node(int data){
            this.next = null;
            this.data = data;
        }
    }

    static void main() {
        Node head = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);
        Node node6 = new Node(7);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        printList(head);
        System.out.println();
        head = printBefore(head, 1);
        printList(head);
        System.out.println();
        head = printBefore(head, 4);
        printList(head);
    }
    static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
    static Node printBefore(Node head, int data){
        Node newNode = new Node(0);
        if(head.data == data) {
            newNode.next = head;
            return newNode;
        }
        head.next = printBefore(head.next, data);
        return head;
    }
}
