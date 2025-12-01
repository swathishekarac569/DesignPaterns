package CODINGandALGO;

class LinkedListProblems {
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node reverseLinkedList(Node head) {
    Node prev = null;
    Node current = head;
    Node next = null;
    while (current != null) {
      next = current.next; // Store next node
      current.next = prev; // Reverse current node's pointer
      prev = current;      // Move prev to current
      current = next;      // Move current to next
    }
    return prev; // New head of the reversed list
  }

  public static void printList(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);

    System.out.print("Original list: ");
    printList(head); // Output: 1 2 3 4

    Node reversedHead = reverseLinkedList(head);
    System.out.print("Reversed list: ");
    printList(reversedHead); // Output: 4 3 2 1
  }
}
