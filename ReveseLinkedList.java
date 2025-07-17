public class ReveseLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
   
    // public void ReverseList(){
    //     Node prev = null;
    //     Node current = head;
    //     Node next = null;
    //     if(head == null && head.next == null ){
    //         return;
    //     }
    //     while (current!=null) {
    //         next = current.next;
    //         current.next = prev;
    //         prev = current;
    //         current = next;
    //     }
    //     head = prev;
    // }
    public void ReverseList(){
        if (head==null&&head.next==null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode!=null) {
            Node nextNode=currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("list is empty");
        }
        Node cuurNode = head;
        while (cuurNode!=null) {
            System.out.print(cuurNode.data+"->");
            cuurNode =cuurNode.next;
        }
        System.out.println("Null");
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // public void addLast(int data){
    //     Node newNode = new Node(data);
    //     if(head == null){
    //         head = newNode;
    //     return;
    //     }
    //     Node currNode = head;
    //     while(head != null ){
    //         currNode = currNode.next;
    //     }
    //     currNode.next = newNode;
    // }
    // public boolean search(int key){
    //     Node current = head;
    //     while (current!=null) {
        
    //         if (current.data == key) {
    //             return true;
    //         }
    //         current = current.next;
    //     }
    //     return false;
    // }
    // recursive approach;
    // public Node reverseRecursive(Node head){
    //     if(head == null || head.next == null){
    //         return head;
    //     }
    //     Node newHead = reverseRecursive(head.next);
    //     head.next.next = head;
    //     head.next = null;
    //     return newHead;
    // }
           public static void main(String[] args){
        ReveseLinkedList list = new ReveseLinkedList();
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(7);
        list.addFirst(8);
        list.printList();
    //    int key = 3;
    //    if (list.search(key)) {
    //     System.out.println("element" + key + "found in the list");
    //    }else{
    //     System.out.println("element" + key + " not found in the list");
    //    }
        // list.head = list.reverseRecursive(list.head);
        list.ReverseList();
        list.printList();
    }
}