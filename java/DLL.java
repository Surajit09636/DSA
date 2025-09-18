public class DLL {
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
    }

    Node head;

    public void insertFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void displayForward(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " <->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displaybackward(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        while(temp != null){
            System.out.print(temp.data + " <->");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        DLL list = new DLL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.displayForward();
        list.displaybackward();
    }
}
