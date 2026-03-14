import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListOperations {
    public static Node insertAthead(Node head,int val){
        
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
        return head;
    }
    
    public static Node insertAtTail(Node head,int val){
        Node newNode=new Node(val);
        if(head==null){
            return newNode;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }


    public static Node deleteHead(Node head) {
        if (head == null) {
            return null;
        } else {
            head = head.next;
        }
        return head;
    }

    public static Node deleteTail(Node head){
        if(head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    
    public static Node deleteMiddle(Node head,int k){
        Node temp=head;
        if(head==null){
            return null;
        }
        if(head!=null && k==1){
            return head.next;
        }
        for(int i=1;i<(k-1);i++){
            temp=temp.next;
        }
        if(temp.next!=null){
            temp.next=temp.next.next;
        }
        return head;

    }

    public static int count(Node head) {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public static Node createLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Node head = createLL(arr);
        print(head);

        int length = count(head);
        System.out.println("\nLength of Linked List = " + length);

        // head = deleteHead(head);
        // System.out.println("\n After Deleting Head:");
        // print(head);

        // deleteTail(head);
        // System.out.println("\n After Deleting Tail:");
        // print(head);

        // System.out.println("\nEnter which element you want to delete:");
        // int k=sc.nextInt();
        // deleteMiddle(head,k);
        // System.out.println("\nAfter Deleting Middle:");
        // print(head);


        // head=insertAthead(head, 6);//Insertion At Head
        // System.out.println("\nElement After Insert At Head :");
        // print(head);

        head=insertAtTail(head, 10);//Insertion At Head
        System.out.println("\nElement After Insert At Tail :");
        print(head);

    }
}