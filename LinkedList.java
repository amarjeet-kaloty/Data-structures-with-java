class LinkedList{
    Node head = null;

    public Node insert(int data){
        Node new_Node = new Node(data, head);
        if(head == null){
            head = new_Node;
            return head;
        }
        Node cur_Node = head;
        while(cur_Node.next != null){
            cur_Node = cur_Node.next;
        }
        cur_Node.next = new_Node;
        return head;
    }

    public void display(){
        Node cur_Node = head;
        while(cur_Node != null){
            System.out.print(cur_Node.data + " ");
            cur_Node = cur_Node.next;
        }
    }

    public int length(){
        int total = 0;
        Node cur_Node = head;
        while(cur_Node != null){
            total += 1;
            cur_Node = cur_Node.next;
        }
        return total;
    }

    public Node removeLast(){
        Node cur_Node = head;
        while(cur_Node.next.next != null){
            cur_Node = cur_Node.next;
        }
        cur_Node.next = null;
        return head;
    }

    public Node removeFirst(){
        if(head == null)
            return head;
        Node cur_Node = head;
        cur_Node = cur_Node.next;
        head.next = null;
        head = cur_Node;
        return head;
    }


    public static void main(String[] args){
        LinkedList l = new LinkedList();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.display();
        System.out.println();
        System.out.println("length: " + l.length());
        l.removeLast();
        l.display();
        l.insert(40);
        l.insert(50);
        System.out.println();
        l.display();
        l.removeFirst();
        System.out.println();
        l.display();
    }
}

class Node{
    int data;
    Node next;

    public Node(int data, Node next){
        this.data = data;
        this.next = null;
    }
}