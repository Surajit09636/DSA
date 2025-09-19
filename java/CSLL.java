import java.util.*;

public class CSLL {
    // class Node{
    //     int data;
    //     Node next;
    //     Node(int data){
    //         this.data = data;
    //         next = null;
    //     }
    // }
    // Node head = null, tail = null;

    // public void insert(int data){
    //     Node newNode = new Node(data);
    //     if(head == null){
    //         head = newNode;
    //         tail = newNode;
    //         tail.next = head;
    //     } else {
    //         tail.next = newNode;
    //         tail = newNode;
    //         tail.next = head;
    //     }
    // }

    // public void Display(){
    //     if(head == null){
    //         return;
    //     }
    //     Node temp = head;
    //     do{
    //         System.out.print(temp.data + " ->");
    //         temp = temp.next;
    //     }while(temp != head);
    //     System.out.println(head.data);
    // }

    LinkedList<Integer> list = new LinkedList<>();

    public void insert(int data){
        list.add(data);
    }

    public void Display(){
        if(list.isEmpty()){
            return;
        }
        
        for(int data : list){
            System.out.print(data + " -> ");
        }
        System.out.println(list.getFirst());;
    }

    

    public static void main(String args[]){
        CSLL list = new CSLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.Display();
    }
}
