import java.util.*;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
    }
}


public class MyClass {
    
    
    static void printLL(Node head) {
        
        while(head != null) {
            System.out.println(head.data+" ");
            head = head.next;
        }
    }
    
    public static void main(String args[]) {
        
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        Node head = null;
        Node temp = null;
        
        for(int i = 0; i < n ; i++) {
            
            int curr = s.nextInt();
            
            if(head == null) {
                head = new Node(curr);
                temp = head;
            }else {
                
                temp.next = new Node(curr);
                temp = temp.next;
            }
            
        }
        
        printLL(head);
        
    }
}
