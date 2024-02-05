package javaprog.DSA.LinkedList;


class Node {
    int data;      // the data value
    Node next;      // the reference to the next Node in the linked list
    // Constructors
    Node(int data1, Node next1) {
        this.data = data1;  // Initialize data with the provided value
        this.next = next1;  // Initialize next with the provided reference
    }
    Node(int data1) {
        this.data = data1;  // Initialize data with the provided value
        this.next = null;   // Initialize next as null since it's the end of the list
    }
  }
  
  public class Intro {
    public static void solve() {
        int[] arr = {2, 5, 8, 7};
        // Creating a new Node with the value from the array
        Node head = new Node(arr[0]);
        Node temp = head;
        System.out.println(temp.next);
  
  
        for (int i = 1; i < arr.length; i++) {
          temp.next = new Node(arr[i],null);
          System.out.println(temp.next);
          temp = temp.next;
        }
  
        temp = head;
        while (temp!=null) {
          System.out.println(temp.data);
          temp = temp.next;
        }
    }
  }