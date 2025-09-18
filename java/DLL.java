import java.util.*;

public class DLL {
    // class Node{
    //     int data;
    //     Node next;
    //     Node prev;
    //     Node(int data){
    //         this.data = data;
    //         next = null;
    //         prev = null;
    //     }
    // }

    // Node head;

    // public void insertFirst(int data){
    //     Node newNode = new Node(data);
    //     if(head == null){
    //         head = newNode;
    //         return;
    //     }
    //     Node temp = head;
    //     while(temp.next != null){
    //         temp = temp.next;
    //     }
    //     temp.next = newNode;
    //     newNode.prev = temp;
    // }

    // public void displayForward(){
    //     Node temp = head;
    //     while(temp != null){
    //         System.out.print(temp.data + " <->");
    //         temp = temp.next;
    //     }
    //     System.out.println("null");
    // }

    // public void displaybackward(){
    //     Node temp = head;
    //     while(temp.next != null){
    //         temp = temp.next;
    //     }
    //     while(temp != null){
    //         System.out.print(temp.data + " <->");
    //         temp = temp.prev;
    //     }
    //     System.out.println("null");
    // }

    LinkedList<Integer> list = new LinkedList<>();

    public void insert(int data){
        list.add(data);
    }

    void displayForward(){
        for(int data : list){
            System.out.print(data + " <->");
        }
        System.out.println("null");
    }

    void displayBackward(){
        ListIterator<Integer> it = list.listIterator(list.size());
        while (it.hasPrevious()){
            System.out.print(it.previous() + " <->");
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        DLL list = new DLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.displayForward();
        list.displayBackward();
    }
}
