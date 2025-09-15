import java.util.*;
public class SinglyLL {
    // class Node{
    //     int data;
    //     Node next;
    //     Node(int data){
    //         this.data = data;
    //         next = null;
    //     }
    // }
    // Node head;

    // public void insert(int data){
    //     Node newNode = new Node(data);
    //     if(head == null){
    //         head = newNode;
    //         return;
    //     } else {
    //         Node temp = head;
    //         while(temp.next != null) {
    //             temp = temp.next;
    //         }
    //         temp.next = newNode;
    //     }

    // }

    // void Display(){
    //     Node temp = head;
    //     while(temp != null){
    //         System.out.print(temp.data + " -> ");
    //         temp = temp.next;
    //     }
    //     System.out.println("null");
    // }

    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Linked list" + list);
        
        // Treversing like a singly linked list
        for(int data : list){
            System.out.print(data + " -> ");
        }
        System.out.println("null");
    }
}
