// collection framework
// import java.util.*;
// public class LL{
//    public static void main(String args[]) {
//        LinkedList<String> list = new LinkedList<String>();
//        list.add("is");
//        list.add("a");
//        list.addLast("list");
//        list.addFirst("this");
//        list.add(3, "linked");
//        System.out.println(list);
//        System.out.println(list.get(0));
//        System.out.println(list.size());   
//        list.remove(3);
//        list.removeFirst();
//        list.removeLast();
      
//        System.out.println(list);
//    }
// }

//scratch implimentation; 

import java.util.*;
public class LL{
    Node head;
    private int size;
    LL(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
       if(head == null){
        head = newNode;
        return;
       }
       newNode.next = head;       
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!= null ){
            currNode = currNode.next;
        }
        currNode.next = newNode;
     }
     public void printList(){
        if(head == null){
            System.out.print("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
     }
     public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
        }
        size--;
        head = head.next;
     }
     public void deleteLast(){
        if(head == null){
            System.out.println("list is empty");
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;         
        }
        secondLast.next = null;
     }
     public int getSize(){
        return size;
     }
    public static void main(String[] args){
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.printList();
        // list.deleteFirst();
        // list.printList();
        // list.deleteLast();
        // list.printList();
        System.out.print(list.getSize());
    }   
}
