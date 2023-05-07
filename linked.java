class linked{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
       
    }
    public void addfirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void middle(){
        Node  slow = head;
        Node  fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);

    }
    public void disply(){
        if(head == null ){
            System.out.print("List is Empty");
            return;
        }
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" "+"-->");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        linked list = new linked();
        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(3);
        list.addfirst(4);
        list.addfirst(5);
       
        list.disply();
        System.out.println();
        list.middle();
        list.disply();
    }

}



