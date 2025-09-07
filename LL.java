public class LL {
    private Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    public void addfirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " ->");
            currNode = currNode.next;
        }

        System.out.print("null");
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
    }

    public static void main(String[] args){
        LL list = new LL();
        list.addfirst("are");
        list.addfirst("you");
        list.addLast("a");
        list.addLast("Gay");
        list.printList();
    }
}
