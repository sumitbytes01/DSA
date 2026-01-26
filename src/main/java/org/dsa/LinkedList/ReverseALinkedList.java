package org.dsa.LinkedList;

public class ReverseALinkedList {
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        static void printList(Node head) {
            while (head != null) {
                System.out.print(head.data + " -> ");
                head = head.next;
            }
            System.out.println("nullptr");
        }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        printList(head);
        System.out.println("==================");

        head = reverseLL(head);
        printList(head);
    }

    private static Node reverseLL(Node head) {
            Node prev = head;
            Node curr = head.next;
            while (curr != null){
                Node nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }
            head.next = null;
            head = prev;
            return head;
    }
}
