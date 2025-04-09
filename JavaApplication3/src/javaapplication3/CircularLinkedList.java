/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

 class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    private Node head;

    // Constructor
    public CircularLinkedList() {
        head = null;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Insert a node at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            newNode.next = newNode; // Circular reference to itself
        } else {
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }
            newNode.next = head;
            last.next = newNode;
        }
        head = newNode;
    }

    // Insert a node at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            newNode.next = newNode; // Circular reference to itself
            head = newNode;
        } else {
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }
            last.next = newNode;
            newNode.next = head;
        }
    }

    // Insert a node at a specific position (index)
    public void insertAtPosition(int data, int index) {
        Node newNode = new Node(data);
        if (index < 0) {
            throw new IllegalArgumentException("Invalid index");
        }
        if (index == 0) {
            insertAtBeginning(data);
            return;
        }
        Node current = head;
        int currentIndex = 0;
        while (currentIndex < index - 1 && current.next != head) {
            current = current.next;
            currentIndex++;
        }
        if (currentIndex < index - 1) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        newNode.next = current.next;
        current.next = newNode;
    }
public void removeLast() {
    if (isEmpty()) {
        return; // List is empty, nothing to remove
    }

    if (head.next == head) {
        // Special case: There's only one node in the list
        head = null;
        return;
    }

    Node previous = null;
    Node current = head;

    while (current.next != head) {
        previous = current;
        current = current.next;
    }

    // Update references to remove the last node
    previous.next = head;// head=previous;
}

    
    // Remove a node with a specific data value
    public void remove(int data) {
        if (isEmpty()) {
            return; // List is empty, nothing to remove
        }
        if (head.data == data) {
            // Special case: Removing the head node
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }
            if (head == last) {
                head = null; // Only one node in the list
            } else {
                head = head.next;
                last.next = head;
            }
            return;
        }
        Node previous = null;
        Node current = head;
        do {
            if (current.data == data) {
                previous.next = current.next;
                return;
            }
            previous = current;//3,2,1
            current = current.next;//2,1
        } while (current != head);
    }

    // Display the circular linked list
    public void display() {
        if (isEmpty()) {
            System.out.println("Circular Linked List is empty.");
            return;
        }
        Node current = head;
        do {
            System.out.print (current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println(head.data + " (Head)");
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.insertAtBeginning(2);
           cll.insertAtBeginning(1);
        cll.insertAtEnd(3);
        
        
        
        cll.display(); // Output: 0 -> 1 -> 2 -> 3 (Head)
System.out.println("--------------");
       cll. removeLast( );
        cll.display(); // Output: 0 -> 2 -> 3 (Head)
    }
}
