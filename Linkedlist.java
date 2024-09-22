

public class Linkedlist {
    public static class Node {
        int  data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;
    public int size=0;

    public void addfirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
        System.out.println("Element inserted at first: " + data);
        size++;
    }

    public void addlast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
        System.out.println("Element inserted at last: " + data);
        size++;
    }

    public void addatpos(int position,int data){
        Node newnode=new Node(data);
        Node temp=head;
        int counter=1;
        if (head == null) {
            head = tail = newnode;
        }else if(position==1){
            addfirst(data);
        }else if(position == size ){
            addlast(data);
        }else
        while(counter<position-1){
            temp=temp.next;
            counter++;
        } 
        newnode.next=temp.next;
        temp.next=newnode;
        size++;
        System.out.println("element added at: "+position+"  is :"+data);


    }
    public void delete(int position){
        Node temp=head;
        int counter=1;
        while(counter < position-1){
            temp=temp.next;
            counter++;
        }
       temp.next=temp.next.next;
    }
    public void printll(){
        Node temp=head;
        if(head==null){
            System.out.println("Linked list is empty");
        }
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("");
    }

    public long number(Node head) {
        long n = 0;
        Node temp=head;
        while (temp != null) {
            n = n * 10 + temp.data;
            temp = temp.next;  // move to the next node
        }
        return n;
    }
    public  long multiplyLinkedLists(Node l1, Node l2) {
        long num1 = number(l1);
        long num2 = number(l2);
        
        return num1 * num2;
    }
     public void palindrome(Node head){
        int orginal=0; int reverse=0;
        Node temp=head;
        while(temp!=null){
            orginal=orginal*10+temp.data;
            temp=temp.next;
        }
        int num=orginal;
        while(num>0){
            reverse=(reverse*10) +  (num%10);
            num=num/10;
        }
        if(orginal == reverse){
            System.out.println("A palindrome");
        }else System.out.println("Not a palindrome");
    }


    public static void main(String[] args) {
        Linkedlist l1 = new Linkedlist();
        l1.addfirst(2);
        l1.addfirst(3);
        l1.addfirst(1);
        
        Linkedlist l2 = new Linkedlist();
        l2.addfirst(1);
        l2.addfirst(1);
        System.out.print("List 1: ");
        l1.printll();
        System.out.print("List 2: ");
        l2.printll();
        
       long result=l1.multiplyLinkedLists(l1.head,l2.head);
       System.out.println("result :"+result);
    }
}
