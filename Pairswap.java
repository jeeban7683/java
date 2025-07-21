public class Pairswap {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public Node swapPairs(Node head){
        if(head==null||head.next==null){
            return head;
        }
    Node dummy = new Node(0);
    dummy.next = head;
    Node point = dummy;
    while(point.next != null&&point.next.next!=null){
        Node swap1 = point.next;
        Node swap2 = point.next.next;
        swap1.next = swap2.next;
        swap2.next = swap1;
        point.next = swap2;
        point = swap1;
    }
    return dummy.next;
}
    
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next!= null){
                temp = temp.next;
            }
            temp.next = newNode;
        }

    }
    // public void printList(){
    //     if(head == null){
    //         System.out.print("list is empty");
    //         return;
    //     }
    //     Node currNode = head;
    //     while(currNode!=null){
    //         System.out.print(currNode.data + "->");
    //         currNode = currNode.next;
    //     }
    //     System.out.println("NULL");
    //  }
    public void printList(){
        if(head == null){
            System.out.println("list is empty :");
            return;
        }
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
     public static void main(String[] args){
        Pairswap list = new Pairswap();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        System.out.print("Original List: ");
        list.printList();
        list.head = list.swapPairs(list.head);
        System.out.print("List After Swapping Pairs: ");
        list.printList();
    }   
}
  

