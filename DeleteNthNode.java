public class DeleteNthNode {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    

    public Node deleteNthNode(Node head,int n){
        Node dummy = new Node (0);
        dummy.next = head;
        Node firstpointer = dummy;
        Node secondpointer = dummy;
        for (int i = 0; i < n; i++) {
            secondpointer = secondpointer.next;
        }
        while (secondpointer.next!=null) {
            firstpointer = firstpointer.next;
            secondpointer = secondpointer.next;
        }
        firstpointer.next = firstpointer.next.next;
        return dummy.next;



    }
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode; 
    }
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        DeleteNthNode list = new DeleteNthNode(); 
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        
        System.out.println("Original List:");
        list.printList();
  
        list.head = list.deleteNthNode(list.head, 2);

        System.out.println("List after deleting the 2nd node from the end:");
        list.printList();
    }
}