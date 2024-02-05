package javaprog.DSA.LinkedList.SingleLinkedList;

public class LinkedList {

  /*
   * @brief INSERTION
   */

  public static Node InsertInLinkedList(int arr[]) {
    // Your code for inserting elements in the linked list goes here
    //using 1_constructor SAME for c_2
    Node head = new Node(arr[0]);
    Node temp = head;
    for (int i = 1; i < arr.length; i++) {
        temp.next = new Node(arr[i]);
        temp = temp.next; 
    }
    return head;
  }
  
  public static Node InsertAtHead(Node head , int data){
    Node temp = new Node(data);
    //using c_2
    // Node temp = new Node(data, head);
    temp.next = head;
    return temp;


  }

  public static Node InserAtTail(Node head , int data){
  
    Node temp = head;
    while (temp.next!=null) {
      temp = temp.next;
    }
    temp.next = new Node(data);
    return head;    
  }

  public static Node InsertAtPos(Node head , int data , int pos){
    if (pos == 0 ){
      Node temp = new Node(data);
      temp.next = head;
      return head;
    }

    Node temp = head;
    for(int i = 0 ; i<pos - 1 ; i++){
      temp = temp.next;
    }
    
    if (temp == null) {
      return head;
    }
    
    Node temp1 = new Node(data,temp.next);
         temp.next = temp1;

    return head;
  }

  public static void PrintLL(Node head){
    while (head != null) {
        System.out.print(head.data + " ");
        head = head.next;
    }
  }

  public static void solve() {
    int[] arr = {1, 2, 3, 4, 5};
    // Insertion in Linked list
    Node head = InsertInLinkedList(arr);
    head = InsertAtHead(head, 9);
    head = InserAtTail(head, 7);
    head = InsertAtPos(head, 43, 5);//pos  = pos +1 ans index law
    PrintLL(head);
  }
}
