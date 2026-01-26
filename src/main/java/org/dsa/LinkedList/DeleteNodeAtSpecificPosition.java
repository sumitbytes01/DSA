package org.dsa.LinkedList;

class DeleteNodeAtSpecificPosition {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node deleteNode(Node head, int position) {

        // Head is to be deleted
        if (position == 1) {
            head = head.next;
            return head;
        }

        // Traverse to the node before
        // the one to be deleted
        Node curr = head;
        for (int i = 1; i < position; i++) {
            curr = curr.next;
        }

        // Delete the node at the position
        curr.next = curr.next.next;

        return head;
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
        int len = getLengthRecursive(head);
        System.out.println("========="+len+"=========");
        printList(head);
        System.out.println("==================");
        int position = 3;
        head = deleteNode(head, position);

        printList(head);
    }

    private static int getLengthRecursive(Node head) {
        if(head == null)
            return 0;
        return 1+getLengthRecursive(head.next);
    }
}