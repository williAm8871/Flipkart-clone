import java.util.Scanner;
public class add{
    Node head;
    Node tail;
   static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void display(){
        if(head == null){
            System.out.print("list is empty");
        }
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" -->");
            curr = curr.next;
        }
        System.out.print("Null");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        Node tail = null;
        for(int i =0 ; i < n; i++){
            int data = sc.nextInt();
            Node newnoNode = new Node(data);
            if(head == null){
                head = newnoNode;
                tail = newnoNode;
            }
            else{
                tail.next = newnoNode;
                tail = newnoNode;
            }
        }
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+"-->");
            curr = curr.next;
        }
         
    }
}

